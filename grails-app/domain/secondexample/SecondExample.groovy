package secondexample

import metafunctionality.ModuleInput

class SecondExample extends ModuleInput {
    String word
    String answer
    static hasMany = [rhymingCandidates:String]
    List rhymingCandidates
}
