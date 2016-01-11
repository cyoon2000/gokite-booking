
CREATE TABLE property (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  name varchar(255) not null,
  primary key (id)
) ENGINE=InnoDB;

