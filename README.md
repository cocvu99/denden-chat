# denden-chat
Chat web-application from scratch

1. Requirements
- Phân tích yêu cầu Functional Requirements
 + Liệt kê các chức năng mà hệ thống có
 + Có thể sẽ có nhiều chức năng cơ bản CRUD, thì nên tập trung làm chức năng cốt lõi của bài toán. Ví dụ: Uber thì là chức năng đặt xe hoạt động như thế nào, hay tinder thì quét để tìm bạn ra sao… ,
 
- Non-functional requirements:
 + Có cần consistency, transaction hay ko? có chấp nhận delay data ở đâu hay ko?

2. High level design
- Vẽ diagram xem các component của hệ thống như thế nào, ví dụ: load balancer, service, db sử dụng, cache, search engine, …
- Chi tiết thiết kế API của tính năng cốt lõi nhất
- Các model của hệ thống là gì?
- Sử dụng REST api cho những chức năng gì?
- Nếu hệ thống cần realtime, sử dụng websocket hay gì để kết nối?
- Có cần sử dụng những kiến thức liên quan đến lock (distributed lock, optimistic lock, …) hay ko?
- Có cần sử dụng cache ko?

5. Implement chức năng cốt lõi nhất
- Sử dụng Spring cùng các công nghệ liên quan để implement
