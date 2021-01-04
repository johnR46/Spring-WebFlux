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

- 16/12/2020
 - การตั้งค่า Default Time Zone
 - Prerequisites
  - เข้าใจเรื่อง timezone หรือจะอ่านจากนี่ > https://www.jittagornp.me/blog/short-summary-of-time-zone/
    - ลองจิจูด (Longitude) 
      - มี 360 เส้น 
      - ผ่ากลาง (กรีนิช ลอนดอน สหราชอาณาจักร = 0) จะอยู่ซีกซ้าย 180 เส้น (-180 องศา) และซีกขวาอีก 180 เส้น (+180 องศา)
  - เกี่ยวอะไรกับ timezone ? 
   - กำหนดให้ กรีนิช ลอนดอน สหราชอาณาจักร คือเวลาที่ 0
    - ให้ทุก ๆ ลองจิจูดที่เพิ่มขึ้น 15 องศา หรือ 15 เส้น (ทั้งซ้าย และขวา) จะบวกหรือลบไป 1 ชม 
    - หรือ สั้นๆ 360 องศา / 24 ชั่วโมง = 15 องศา/ชั่วโมง นั่นเอง
  # ลองจิจูดของไทยตั้งอยู่ที่ประมาณ +100 องศา พอเราลองเอา 100/15 ~= 6.66667 หรือ +7 ชั่วโมงนั่นเอง
  - ยังไม่จบ มีต่อ 

- 17/12/2020
 ไม่ได้ทำ หลับก่อน  ส่งเบียร์แปป

- 18/12/2020
 - การตั้งค่า Default Time Zone ต่อ 
 - งงอีตรง /current-datetime ทำงานไม่ได้ 

- 19/12/2020
 - การตั้ง default-locale
 - มีความเข้าใจเรื่อง Internationalization (i18n) และ Localization (L10n) (นั่งอ่าน)
   - i18n และ L10n เป็นเรื่องของการทำให้โปรแกรมที่เราเขียน รองรับ (Support) หลายภาษา หลายรูปแบบการแสดงผล 
 - Language Code & Language Tag
  - th , en Language Code (บอกแค่ภาษา)
  - th-TH en-US Language Tag บอก เจาะจงทั้งภาษาและ Region (Country) เพื่อให้ใช้รูปแบบของภาษาและการแสดงผล 

- 20/12/2020
 - การดึง Static Resources ( ตัวอย่างการ Get Static Resources จาก Spring-boot Reactive )
 - ง่ายแปลกๆ แต่เท่านี้เนี่ยนะ = =

- 21/12/2020
 -  การ Custom Path เพื่อดึง Static Resources
   - spring.webflux.static-path-pattern: /assets/**  
      - ตรง assets ตั้งชื่อตรงนี้แหละเปลียนเป็นไรก็ได้ แต่ตอนเข้า http://localhost:8080/assets/images/beer.png ควรจะ แทนที่คำว่า assets ด้วยคำที่แก้ไปซะ
   - spring.resources.static-locations: classpath:/static/

- 22/12/2020
 - ตัวอย่างการ Config Http Caching ให้ Static Resources สำหรับ Spring-boot Reactive
   # caching
   spring.resources.cache.cachecontrol.cache-public=true
   # 1 day = 86400 seconds = 60 seconds x 60 x 24
   spring.resources.cache.cachecontrol.max-age=86400

- 23/12/2020
 - ตัวอย่างการเขียน  Spring-boot Reactive Controller
   # ข้อสังเกตุ
   - @RestController เป็นการระบุว่า class นี้เป็น Controller แบบที่เป็น RESTFul
   - @RequestMapping("/users") เป็นการกำหนด Path สำหรับทุก ๆ Method ใน Controller นี้ ว่าให้ขึ้นต้นด้วยคำว่า /users
   - @RequestBody เป็นการแปลงและรับค่า request body จาก JSON => Java Object
  mono = 1 
  Flux = หลายอัน

- 25/12/2020
  - พัง

- 26 - 03 หยุดปีใหม่ ถถถ

- 04/01/2021
 - การ config Cors (Cross-origin resource sharing)