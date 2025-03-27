# Sử dụng Python 3.9 làm base image
FROM python:3.9

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Sao chép file requirements.txt và cài đặt dependencies
COPY requirements.txt .

RUN pip install --no-cache-dir -r requirements.txt

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Mở cổng 5000
EXPOSE 5000

# Lệnh chạy ứng dụng
CMD ["python", "app.py"]
