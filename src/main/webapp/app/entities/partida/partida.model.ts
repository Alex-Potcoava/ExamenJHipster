export interface IPartida {
  id?: number;
  ganador?: string;
  perdedor?: string;
  puntosDelGanador?: number;
}

export class Partida implements IPartida {
  constructor(public id?: number, public ganador?: string, public perdedor?: string, public puntosDelGanador?: number) {}
}

export function getPartidaIdentifier(partida: IPartida): number | undefined {
  return partida.id;
}
