# CinemaRoomRestService
В этом проекте я создадал простой сервис Spring REST, который может управлять небольшим кинотеатром.
Обрабатываю HTTP-запросы в контроллерах, создал службы которые отвечают с помощью объектов JSON.

порт 28852
/seat - показать места в зале
/purchase - купить билет(row, column)
/return - везврат билета по полученному при покупке токену
/stats - общая статистика, количество проданных билетов, выручка, оставшиеся места(пароль super_secret)
