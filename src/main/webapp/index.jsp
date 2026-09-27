<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Feedback</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-body">
            <h3 class="text-center mb-3">Student Feedback</h3>

            <form action="FeedbackServlet" method="post">
                <input type="text" name="name" class="form-control mb-2" placeholder="Your Name" required>

                <select name="subject" class="form-control mb-2">
                    <option>Java</option>
                    <option>Python</option>
                    <option>Web Development</option>
                </select>

                <input type="number" name="rating" min="1" max="5" class="form-control mb-2" placeholder="Rating (1-5)" required>

                <textarea name="message" class="form-control mb-2" placeholder="Your Feedback"></textarea>

                <button class="btn btn-primary w-100">Submit Feedback</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
    