drop database booking;
create database booking;
use booking;

CREATE TABLE property (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  title varchar(255) not null,
  parentProperty bigint REFERENCES property(id),
  propertyType varchar(50) not null,
  latitude decimal(10, 8),
  longitude decimal(11, 8),
  profilePhoto bigint REFERENCES photo(id),
  numBedroom int,
  capacity int,
  minimumStay int,
  extraPersonCharge int,
  googleCalendarId VARCHAR(255),
  primary key (id)
);

CREATE TABLE user (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  userName varchar(255) not null,
  primary key (id)
);

CREATE TABLE photo (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  property bigint not null REFERENCES property(id),
  thumbUrl VARCHAR(255) not null,
  photoUrl VARCHAR(255) not null,
  primary key (id)
);

CREATE TABLE propertyAmenity (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  property bigint not null REFERENCES property(id),
  amenity varchar(50) not null,
  primary key (id)
);

CREATE TABLE booking (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  user bigint not null REFERENCES user(id),
  property bigint not null REFERENCES property(id),
  startDateTimeInclusive date not null,
  endDateTimeExclusive date not null,
  primary key (id)
);

CREATE TABLE occupancy (
  id bigint not null auto_increment,
  creationDate date not null,
  modifiedDate date not null,
  property bigint not null REFERENCES property(id),
  startDateTimeInclusive date not null,
  endDateTimeExclusive date not null,
  timePeriod varchar(63) not null,
  primary key (id)
);
