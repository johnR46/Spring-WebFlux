# Spring-WebFlux

# ทำอย่างน้อยวันละครั้ง ลืมทำเสียเบียร์ป๋องนึง
https://github.com/jittagornp/spring-boot-reactive-example?series=series&fbclid=IwAR1wxtxV11CiOXJdFuAUu9ucIBjkPwPTAIpphphsfnha5Mc38pvjdSekclk

# แนะนำ
https://www.somkiat.cc/hello-spring-webflux-and-r2dbc/


Spring Initializr 
# https://start.spring.io/




#ประวัติการลืม  + วันที่ทำ + หัวข้อ  ขอจดไว้
จำได้ว่า เสียเบียร์ไปแล้วประมาณ 3-4ป๋อง TT


- 10/12/2020
   - การเขียน Dockerfile สำหรับ spring 
   - การ Build Docker Image  docker build -t ชื่อไรก็ได้ .
   - และการ Run Container docker run -d -p พอร์ตนอก:พอร์ตใน --name ชื่อ-imange ชื่อ-ที่จะแสดง
     - ex docker run -d -p 8080:8080 --name hello-world hello-world 

- 11/12/2020
  - วันนี้ทำ jenkins file แต่ทำไม่ทัน เสียเบียร์ไปตามระเบียบ TT 
  - อันนี้ที่ทำไม่ทัน เหตุผล? ติดงานมั้ง

- 12/12/2020
  - วันนี้ก็ยังอยู่กับ jenkins 
  
- 13/12/2020
  - วันนี้ก็ยังอยู่กับ jenkins (หนีมา linux + นั่ง set jenkins server อยู่)
  - ทำ registry ใช้เอง 
   - https://www.jittagornp.me/blog/install-docker-registry/?series=docker
   - (ทำ Jenkins JDK 11 ด้วย Docker)
   - (ทำ private registry on localhost ไว้ใช้ในเครื่อง) 

- 14/12/2020
 - เหนื่อยโว้ย อยู่ๆก็ต้องหาเรื่องทำ flutter TT
 - แง ไอ่เมื่อวานก็ไม่ได้ต่อ ไอ่งานก็ต้องยัด K8s เค๊
 - ช่างแม่ง เอาเบียร์ไปเลย โว้ยยยยยยย

- 15/12/2020
 - ตัวอย่างการเขียน Spring-boot Reactive Logging 
 - http://www.slf4j.org/manual.html
 - @Slf4j เป็นการใช้ annotation ของ lombox เพื่อ generate Log4J Code (logging)
   logging.level.org.springframework=DEBUG
   logging.level.com.example=DEBUG
   logging.file=/log/app.log`