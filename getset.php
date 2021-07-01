class Auto{
    private $marca;
    private $km;
    public function _construct($m,$km){
        $this
    }
    public function setMarca($m){
        $this -> marca = $m;
    }
    public function getMarca($m){
        return $this -> marca;
    }
}

//fuera de la clase
$auto1 = new Auto();
$auto1 -> setMarca ("ford);
echo $auto1->getMarca(); 