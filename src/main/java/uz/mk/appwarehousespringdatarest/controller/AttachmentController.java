package uz.mk.appwarehousespringdatarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.mk.appwarehousespringdatarest.entity.Attachment;
import uz.mk.appwarehousespringdatarest.payload.ApiResponse;
import uz.mk.appwarehousespringdatarest.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @GetMapping
    public HttpEntity<?> getAll() {
        List<Attachment> attachments = attachmentService.getAll();
        return ResponseEntity.ok(attachments);
    }

    @GetMapping("/{id}")
    public HttpEntity<?> getOne(@PathVariable Integer id) {
        Attachment attachment = attachmentService.getOne(id);
        return ResponseEntity
                .status(attachment.getId() != null ? 200 : 404).body(attachment);
    }

    @PostMapping("/upload")
    public HttpEntity<?> upload(MultipartHttpServletRequest request) {
        ApiResponse response = attachmentService.upload(request);
        return ResponseEntity
                .status(response.isSuccess() ? 201 : 404).body(response);
    }

    @GetMapping("/download/{id}")
    public void download(@PathVariable Integer id, HttpServletResponse response) {
        attachmentService.download(id, response);
    }


}
