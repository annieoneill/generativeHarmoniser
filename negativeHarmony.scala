object negativeHarmony {

  def invertMelody(melody: Array[Array[Int]], key:Int):Array[Array[Int]] = {
    melody.map(note => invertNotes(note,key))
  }

  def invertNotes(notes:Array[Int], tonic:Int):Array[Int] = {
    notes.map(note => 2 * tonic - 5 - note)
  }

}
