# Проект "Продуктовый магазин"
## Описание

Веб-приложение для покупки продуктовых товаров онлайн. Приложение реализовано на фреймворке Spring и включает в себя возможности:

- **Категории продуктов**: Организация продуктов по категориям, вывод всех категорий или конкретной, создание и изменение категорий
- **Каталог продуктов**: Каждый продукт имеет название, описание, цену и информацию о наличии. Вывод одного продукта, всех продуктов из конкретной категории или всех продуктов, создание, изменение, удаление продукта
- **Корзина для покупок**: Пользователи могут добавлять товары в корзину и управлять ей (добавление продукта в корзину, уделание продукта из корзины, удаление всех продуктов из корзины). Вывод всех продуктов в корзине.
- **Оформление заказа**: Пользователь может сохранить заказ. Вывод всех заказов одного пользователя по id пользователя, вывод всех существующих заказов.

## Технологический стек:
Spring Boot, Spring Data JPA, Hibernate, Liquibase, PostgreSQL, Spring MVC, Spring Test, Lombok, 

## Запуск проекта
1. Склонировать репозиторий: `git clone https://github.com/anovami/Product_shop.git`
2. `cd Product_shop`
3. Создать базу данных PostgreSQL и укажите параметры подключения в src/main/resources/application.properties.
4. Запустить скомпилированный проект из командной строки: `java -jar C:\путь к папке\target\Product-0.0.1-SNAPSHOT.jar`
5. Для доступа к документации Swagger запустить проект локально и перейти по адресу: `http://localhost:8080/swagger-ui/index.html#/`

  
