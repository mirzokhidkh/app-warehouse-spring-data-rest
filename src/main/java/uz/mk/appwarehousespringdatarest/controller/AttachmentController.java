package uz.mk.appwarehousespringdatarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.mk.appwarehousespringdatarest.entity.Attachment;
import uz.mk.appwarehousespringdatarest.payload.Result;
import uz.mk.appwarehousespringdatarest.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @GetMapping
    public List<Attachment> getAll(){
        return attachmentService.getAll();
    }

    @GetMapping("/{id}")
    public Attachment getOne(@PathVariable Integer id){
        return attachmentService.getOne(id);
    }

    @PostMapping("/upload")
    public Result upload(MultipartHttpServletRequest request){
        return attachmentService.upload(request);
    }

    @GetMapping("/download/{id}")
    public void download(@PathVariable Integer id, HttpServletResponse response){
        attachmentService.download(id,response);
    }



}
