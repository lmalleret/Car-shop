export type CarResponse = {
  brand: string;
  model: string;
  color: string;
  registrationNumber: string;
  modelYear: number;
  price: number;
  description: string;
  _links: {
    self: {
      href: string;
    };
    car: {
      href: string;
    };
    owner: {
      href: string;
    };
  };
};

export type Car = {
  brand: string;
  model: string;
  color: string;
  registrationNumber: string;
  modelYear: number;
  price: number;
  description: string;
};

export type CarEntry = {
  car: Car;
  url: string;
};
