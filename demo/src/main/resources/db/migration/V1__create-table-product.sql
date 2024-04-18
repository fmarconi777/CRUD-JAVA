create table product (
    id text primary key unique not null,
    name text not null,
    price_in_cents float not null
);