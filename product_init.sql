
CREATE TABLE `product_category` (
    `id` int  NOT NULL ,
    `name` text ,
    `parent_id` int ,
    PRIMARY KEY (
        `id`
    )
);

CREATE TABLE `product` (
    `id` int  NOT NULL ,
    `name` text ,
    `description` text ,
    `price` decimal(20,2) ,
    `stock` int ,
    `category_one_id` int ,
    `category_two_id` int ,
    PRIMARY KEY (
        `id`
    )
);

INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (1000, '生鲜类', NULL);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (2000, '烟酒类', NULL);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (3000, '男装类', NULL);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (4000, '日化类', NULL);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (5000, '五金类', NULL);

INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (1001, '水果', 1000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (1002, '菜类', 1000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (1003, '肉类', 1000);

INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (2001, '中酒', 2000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (2002, '洋酒', 2000);

INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (3001, '休闲', 3000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (3002, '运动', 3000);

INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (4001, '香皂', 4000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (4002, '沐浴露', 4000);


INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (5001, '电气具', 5000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (5002, '工具类', 5000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (5003, '建筑五金', 5000);
INSERT INTO `user`.`product_category`(`id`, `name`, `parent_id`) VALUES (5004, '汽车配件', 5000);


INSERT INTO `user`.`product`(`id`, `name`, `description`, `price`, `stock`, `category_one_id`, `category_two_id`) VALUES (1, '螃蟹', '螃蟹描述', 20.01, 1000, 1000, 1003);
INSERT INTO `user`.`product`(`id`, `name`, `description`, `price`, `stock`, `category_one_id`, `category_two_id`) VALUES (2, '黄花鱼', '黄花鱼描述', 30.01, 2000, 1000, 1003);
INSERT INTO `user`.`product`(`id`, `name`, `description`, `price`, `stock`, `category_one_id`, `category_two_id`) VALUES (3, '二锅头', '高度酒', 28.01, 5000, 2000, 2001);







