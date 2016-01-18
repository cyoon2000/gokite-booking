
CREATE TABLE property (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  name varchar(255) not null,
  parentProperty bigint REFERENCES property(id),
  propertyType varchar(50) not null,
  primary key (id)
);

CREATE TABLE user (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  userName varchar(255) not null
);
