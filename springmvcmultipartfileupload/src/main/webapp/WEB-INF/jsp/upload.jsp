<!DOCTYPE html>
<html>
    <head>
        <title>File Upload</title>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script>
        <script src="http://malsup.github.com/jquery.form.js"></script>

        <script type="text/javascript">
            $(function() {

                var bar = $('.bar');
                var percent = $('.percent');
                var status = $('#status');

                $('form').ajaxForm({
                    beforeSend: function() {
                        status.empty();
                        var percentVal = '0%';
                        bar.width(percentVal);
                        percent.html(percentVal);
                    },
                    uploadProgress: function(event, position, total, percentComplete) {
                        var percentVal = percentComplete + '%';
                        bar.width(percentVal);
                        percent.html(percentVal);
                    },
                    complete: function(xhr) {
                        status.html(xhr.responseText);
                    }
                });
            });
        </script>
    </head>
    <body>
        <div class="progress">
            <div class="bar"></div >
            <div class="percent">0%</div >
        </div>

        <div id="status"></div>
        <form method="post" enctype="multipart/form-data">
            <input type="file" name="file"><br>
            <input type="submit" value="Upload File to Server">
        </form>
    </body>
</html>