import { Legality } from "./legality.model";
import { Rule } from "./rule.model";

export interface Card {
  id: number;
  name: string;
  imageName: string;
  manaCost: string;
  typeLine: string;
  description: string;
  flavour: string;
  stats: string;
  artist: string;
  setName: string;
  setCode: string;
  serialNumber: number;
  rarity: string;
  rules?: Rule[];
  legality?: Legality[];
}
