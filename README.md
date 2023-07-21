# گزارش روند انجام آزمایش

## طراحی مبتنی بر تست (Test Driven Development)

در این روش در ابتدا باید تست‌ها را بنویسیم و زمانی که هنوز روی کد بایاس نشده‌ایم و به این ترتیب پیاده‌سازی را انجام نداده‌ایم از روی دیزاین تست‌ها را می‌نویسیم و در ادامه سعی می‌كنیم اولا کدهایی بزنیم که باعث شوند تست‌ها پاس شوند و ثانیا سعی می‌کنیم که کدهایی که زده‌ایم را ریفکتور کنیم و در نتیجه به clean code در عین درست‌ بودن کارایی کد دست پیدا کنیم.

در ابتدا Intellij را نصب می‌کنیم و سپس یک پروژه‌ی مبتنی بر maven می‌سازیم. 
ساختار پروژه در نهایت به شرح زیر است:

<p align="center">
<img width="323" alt="Screenshot 1402-04-30 at 8 23 00 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/e218f853-a707-4fce-afeb-9803b7ab06f8">
</p>

سپس به maven دیپندنسی‌های لازم برای JUnit را به منظور تست اضافه می‌کنیم.

<p align="center">
<img width="860" alt="Screenshot 1402-04-30 at 8 24 00 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/2320fe1f-fb02-4d74-82a5-afd2be12a34d">
</p>

در مرحله‌ی بعد در ابتدا تست‌ها را می‌نویسیم. سعی می‌کنیم در نوشتن تست‌ها تا حد ممکن تست‌های متنوع و با اهداف متفاوت بنویسیم و به این ترتیب فضای ورودی را به صورت کامل پوشش دهیم که حداقل از هر افراز متنوعی از فضای ورودی تست‌های متناسب داشته باشیم.
لازم به ذکر است که انتظار داریم که اگر طول یا عرض مستصیل صفر یا منفی بود -۱ برگرداند که به این معنی است که ورودی معتبر نیست. 

<p align="center">
<img width="768" alt="Screenshot 1402-04-30 at 8 31 12 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/fe10a9d0-10f1-409f-95c3-68f4f82db52a">

<img width="785" alt="Screenshot 1402-04-30 at 8 27 37 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/d3114401-5abe-4e9e-a7cf-987b5abbeace">
</p>

حال به پیاده‌سازی کلاس Rectangle می‌پردازیم. به گونه‌ای که بتواند تست‌ها را پاس کند.

<p align="center">
<img width="451" alt="Screenshot 1402-04-30 at 8 29 04 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/479ca0c1-a2bc-4d5d-89c7-c7331939b479">
</p>

همانطور که در تصویر زیر می‌بینیم بخشی از تست‌ها فیل می‌شوند. چونکه انتظارمان در طراحی برای اعداد صفر و منفی را برآورده نکرده‌ایم.

<p align="center">
<img width="965" alt="Screenshot 1402-04-30 at 8 32 56 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/7abad1aa-8783-4f3f-9c5c-eb0efdf2d450">
</p>

در ادامه متد را به گونه‌ای تغییر می‌دهیم که تست‌ها پاس شوند.

<p align="center">
<img width="387" alt="Screenshot 1402-04-30 at 8 34 12 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/f881311f-6157-47de-b784-275a966ec3b3">
</p>

حال دوباره آن را اجرا می‌کنیم.

<p align="center">
<img width="937" alt="Screenshot 1402-04-30 at 8 34 55 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/791b9b34-bc2f-40d2-903d-2a81442ecf0a">
</p>

هنوز هم یک تست پاس نمی‌شود. به این ترتیب باید صفر بودن را هم پوشش دهیم.

<p align="center">
<img width="431" alt="Screenshot 1402-04-30 at 8 35 36 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/f9d84258-9ad6-4df5-89b3-ff144c55a487">

<img width="915" alt="Screenshot 1402-04-30 at 8 36 31 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/ba6f9e79-24ed-4958-99ee-54400968fba1">
</p>

بنابراین همه‌ی تست‌ها پاس می‌شوند.

حال به کلاس اولیه متد‌های ست و گت را اضافه می‌کنیم.

<p align="center">
<img width="368" alt="Screenshot 1402-04-30 at 8 37 36 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/4964f0cd-b119-4883-bd76-a971fab147c1">
</p>

در ادامه برای مربع تست می‌نویسیم.

<p align="center">
<img width="707" alt="Screenshot 1402-04-30 at 8 44 39 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/f25ba4ed-8f15-43c5-9c8c-78f4e83f5747">
</p>


در نهایت برای اینکه بتوانیم مربع را هم پوشش دهیم باید یک constructor دیگر با یک فیلد ورودی بسازیم.

<p align="center">
<img width="282" alt="Screenshot 1402-04-30 at 8 43 33 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/a669d9f7-1580-4c3a-ab22-b183cf95b308">
</p>

حال تست‌ها را اجرا می‌کنیم.

<p align="center">
<img width="935" alt="Screenshot 1402-04-30 at 8 45 06 PM" src="https://github.com/SinaElahimanesh/Software-SOLID/assets/59636948/2490d705-d6b6-440d-8125-5c5483a011e1">
</p>









