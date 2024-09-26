INSERT INTO `ingredients` (`name`, `category`)
VALUES
('Risotto Rice', 'RICE'),
('Carrots', 'VEGETABLES'),
('Red Wine', 'ALCOHOL'),
('Cheddar Cheese', 'DAIRY'),
('Hard Italian Style Cheese', 'DAIRY'),
('Spaghetti', 'PASTA'),
('Basmati Rice', 'RICE'),
('Apple Cider Vinegar', 'FOOD_CUPBOARD'),
('Ramen Noodles', 'NOODLES'),
('Leek', 'VEGETABLES'),
('Tomato Puree', 'FOOD_CUPBOARD'),
('Olive Oil', 'FOOD_CUPBOARD'),
('All-Purpose Flour', 'BAKING'),
('Frozen Peas', 'FROZEN'),
('Ketchup', 'CONDIMENTS'),
('Whole Wheat Bread', 'BREAD'),
('Chocolate Bar', 'SWEETS'),
('Chicken Breast', 'MEAT'),
('Salmon', 'FISH'),
('Salt', 'SEASONING'),
('Bananas', 'FRUIT'),
('Broccoli', 'VEGETABLES'),
('Beer', 'ALCOHOL'),
('Butter', 'DAIRY'),
('Penne Pasta', 'PASTA'),
('Brown Rice', 'RICE'),
('Udon Noodles', 'NOODLES'),
('Cashews', 'NUTS'),
('Canned Beans', 'FOOD_CUPBOARD'),
('Sugar', 'BAKING'),
('Frozen Pizza', 'FROZEN'),
('Mustard', 'CONDIMENTS'),
('Baguette', 'BREAD'),
('Candy', 'SWEETS'),
('Ground Beef', 'MEAT'),
('Tuna', 'FISH'),
('Black Pepper', 'SEASONING'),
('Grapes', 'FRUIT'),
('Spinach', 'VEGETABLES'),
('Vodka', 'ALCOHOL'),
('Yogurt', 'DAIRY'),
('Lasagna Sheets', 'PASTA'),
('Jasmine Rice', 'RICE'),
('Soba Noodles', 'NOODLES'),
('Pistachios', 'NUTS'),
('Tomato Sauce', 'CONDIMENTS'),
('Water', 'CONDIMENTS'),
('Garlic', 'FOOD_CUPBOARD'),
('Vegetable Stock', 'FOOD_CUPBOARD'),
('Chicken Stock', 'FOOD_CUPBOARD'),
('Beef Stock', 'FOOD_CUPBOARD'),
('Red Chilli', 'VEGETABLES'),
('Baking Soda', 'BAKING'),
('Frozen Chicken', 'FROZEN'),
('Mayonnaise', 'CONDIMENTS'),
('Sourdough Bread', 'BREAD'),
('Lollipops', 'SWEETS'),
('Pork Chops', 'MEAT'),
('Prawns', 'FISH'),
('Garlic Powder', 'SEASONING');

INSERT INTO source (name, url, book, page_number)
VALUES
('Hello Fresh', 'https://www.hellofresh.co.uk/recipes/prawn-and-tomato-risotto-5fe31262ffbca863e22bcc0a', NULL, NULL),
('Hello Fresh', 'https://www.hellofresh.co.uk/recipes/pork-and-cheesy-mash-pie-6166d88728f0dd1e99712143', NULL, NULL),
('Hello Fresh', 'https://www.hellofresh.co.uk/recipes/gochujang-mac-and-cheese-64760d2b904daffe76f26955', NULL, NULL);

INSERT INTO source (name, url, book, page_number)
VALUES
('Joe Wicks', NULL, 'Lean in 15 - The Shift Plan', 34);

INSERT INTO recipe (title, image, cook_time, prep_time, serving_size, source_id)
VALUES
(
  'Prawn and Tomato Risotto',
  'https://img.hellofresh.com/c_fit,f_auto,fl_lossy,h_1100,q_50,w_2600/hellofresh_s3/image/prawn-and-tomato-risotto-d888c1f5-4dd42eab.jpg',
  20,
  35,
  2,
  1
);
INSERT INTO recipe_instructions (recipe_id, instructions)
VALUES
(1, 'Trim the root and the dark green leafy part from the leek. Halve lengthways then thinly slice widthways. Peel and grate the garlic (or use a garlic press). Roughly chop the parsley (stalks and all). Halve the chilli lengthways, deseed then slice thinly. Pour the water (see ingredient list for amount) into a pan and add the vegetable stock powder. Pop onto high heat and bring to the boil, then reduce the heat to low (you want to just keep it warm).'),
(1, 'Heat a drizzle of oil in a wide bottomed pan on medium heat. Once hot, add the leek and fry until softened, 4-5 mins. Stir occasionally. Once soft, stir in the garlic and tomato puree (and a splash more oil if it''s a bit dry). Stir and cook for 1 minute. Add the rice, stir and cook for 1 minute until the edges are starting to look translucent. Add the cider vinegar and allow it to evaporate, 30 seconds.'),
(1, 'Stir in a ladle of stock. When the stock has been absorbed by the rice, stir in another ladle of stock. Keep the pan on medium heat and continue stirring in stock, letting it absorb each time. The cooking time should be 20-25 mins, your risotto is done when your rice is ''al dente'' - cooked through but with a tiny bit of firmness left in the middle. TIP: You may not need all your stock or you may need a bit of extra water.'),
(1, 'When the risotto has 5 mins left, stir in the prawns and simmer until they are cooked, 5 mins. IMPORTANT: The prawns are cooked when pink on the outside and opaque in the middle.'),
(1, 'Once cooked, remove the risotto from the heat and add the hard Italian cheese, a knob of butter (if you have some) and half the parsley. Stir vigorously until the cheese and butter have melted.'),
(1, 'Taste the risotto and add salt and pepper if you feel it needs it. Serve the risotto in bowls with the red chilli (use less chilli if you don''t like heat) and remaining parsley sprinkled on top. Enjoy!');

INSERT INTO recipe_ingredient (ingredient_id, quantity, unit, recipe_id)
VALUES
(1,175,'GRAM',1),
(10,1,'WHOLE',1),
(8,15,'MILLILITER', 1),
(59,150,'GRAM',1),
(11,30,'GRAM',1),
(48,5,'GRAM',1),
(52,1,'WHOLE',1),
(49,20,'GRAM',1),
(5,40,'GRAM',1),
(47,750, 'MILLILITER',1);



