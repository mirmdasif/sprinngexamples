package net.asifhossain.multipartfileupload.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author asif.hossain
 * @since 3/8/17.
 */
@Controller
@RequestMapping("/upload")
public class FileUploadController {
    @RequestMapping(method = RequestMethod.GET)
    String show() {
        return "upload";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile file) {

        System.out.println(file.getName());
        return "home";
    }
}
