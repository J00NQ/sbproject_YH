var main = {
    init: function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save: function () {
        var _this = this;
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };
        if (!_this.validateForm(data)) {
            return;
        }
        $.ajax({
            type: 'POST',
            url: '/api/v1/posts',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('글이 등록되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    validateForm: function (data) {
        if (!data.title || data.title.trim() === '') {
            alert('제목을 입력해주세요.');
            return false;
        }
        if (!data.content || data.content.trim() === '') {
            alert('내용을 입력해주세요.');
            return false;
        }
        return true;
    }
};

main.init();