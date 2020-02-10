package com.knoldus

import org.scalatest._

class CurrencyConvSpec extends FlatSpec with BeforeAndAfterAll {
  var currency: CurrencyConv = new CurrencyConv

  override def beforeAll(): Unit = {
    currency = new CurrencyConv()
  }

  override def afterAll(): Unit = {
    if (currency != null) {
      currency = null
    }
  }

  "convertRupeesIntoAnotherCurrencies" should "convert rupees into dollar" in {
    val actualResult = currency.inrTo(5, "Dollar")
    val expectedResult = 0.071428575f
    assert(expectedResult == actualResult)
  }

  "convertRupeesIntoAnotherCurrencies" should "convert rupees into euro" in {
    val actualResult = currency.inrTo(5, "Euro")
    val expectedResult = 0.0625f
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into pound sterling" in {
    val actualResult = currency.inrTo(5, "Pound")
    val expectedResult = 0.056818184f
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into canadian" in {
    try {
      val actualResult = currency.inrTo(5, "canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertRupeesIntoAnotherCurrencies" should "convert rupees into yen" in {
    val actualResult = currency.inrTo(5, "Yen")
    val expectedResult = 7.9365077f
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into ringgit" in {
    val actualResult = currency.inrTo(5, "Ringgit")
    val expectedResult = 0.3125f
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into sgd" in {
    val actualResult = currency.inrTo(5, "Franc")
    val expectedResult = 0.07f
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into aud" in {
    val actualResult = currency.inrTo(5, "Dinar")
    val expectedResult = 0.0215f
    assert(expectedResult == actualResult)
  }
  "convertRupeesIntoAnotherCurrencies" should "convert rupees into cad" in {
    val actualResult = currency.inrTo(5, "Yuan")
    val expectedResult = 0.49f
    assert(expectedResult == actualResult)
  }


  "convertDollarIntoAnotherCurrencies" should "convert dollar into euro" in {
    val actualResult = currency.dollorTo(5, "Euro")
    val expectedResult = 4.35f
    assert(expectedResult == actualResult)
  }

  "convertDollarIntoAnotherCurrencies" should "convert dollar into pound sterling" in {
    val actualResult = currency.dollorTo(5, "Pound")
    val expectedResult = 3.9f
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into yen" in {
    val actualResult = currency.dollorTo(5, "Yen")
    val expectedResult = 555.435f
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into canadian" in {
    try {
      val actualResult = currency.dollorTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertDollarIntoAnotherCurrencies" should "convert dollar into ringgit" in {
    val actualResult = currency.dollorTo(5, "Ringgit")
    val expectedResult = 20.85f
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into sgd" in {
    val actualResult = currency.dollorTo(5, "Franc")
    val expectedResult = 4.9f
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into Aud" in {
    val actualResult = currency.dollorTo(5, "Dinar")
    val expectedResult = 1.5f
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into cad" in {
    val actualResult = currency.dollorTo(5, "Yuan")
    val expectedResult = 34.95f
    assert(expectedResult == actualResult)
  }
  "convertDollarIntoAnotherCurrencies" should "convert dollar into rupees" in {
    val actualResult = currency.dollorTo(5, "Rupees")
    val expectedResult = 350.0f
    assert(expectedResult == actualResult)
  }


"convertPoundIntoAnotherCurrencies" should "convert Pound into euro" in {
  val actualResult = currency.poundTo(5, "Euro")
  val expectedResult = 5.5
  assert(expectedResult == actualResult)
}

  "convertPoundIntoAnotherCurrencies" should "convert Pound into Riyal  sterling" in {
  val actualResult = currency.poundTo(5, "Riyal")
  val expectedResult =  24.2
  assert(expectedResult == actualResult)
}
  "convertPoundIntoAnotherCurrencies" should "convert Pound into yen" in {
  val actualResult = currency.poundTo(5, "Yen")
  val expectedResult = 26.45
  assert(expectedResult == actualResult)
}
  "convertPoundIntoAnotherCurrencies" should "convert Pound into canadian" in {
  try {
  val actualResult = currency.poundTo(5, "Canadian")
}
  catch {
  case ex: Exception => {
  assert(ex.getMessage == "invalid currency")
}
}
}

  "convertPoundIntoAnotherCurrencies" should "convert Poundinto ringgit" in {
  val actualResult = currency.poundTo(5, "Ringgit")
  val expectedResult = 4.9
  assert(expectedResult == actualResult)
}
  "convertPoundIntoAnotherCurrencies" should "convert Pound into Franc" in {
  val actualResult = currency.poundTo(5, "Franc")
  val expectedResult = 6.3
  assert(expectedResult == actualResult)
}
  "convertPoundIntoAnotherCurrencies" should "convert Pound into Dinar" in {
  val actualResult = currency.poundTo(5, "Dinar")
  val expectedResult = 1.9500000000000002
  assert(expectedResult == actualResult)
}
  "convertPoundIntoAnotherCurrencies" should "convert Poundinto Yuan" in {
  val actualResult = currency.poundTo(5, "Yuan")
  val expectedResult = 45.099999999999994
  assert(expectedResult == actualResult)
}
  "convertPoundIntoAnotherCurrencies" should "convert dollar into Rupees" in {
  val actualResult = currency.poundTo(5, "Rupees")
  val expectedResult = 440.0
  assert(expectedResult == actualResult)
}
//////////////////////////////////////////


  "convertEuroIntoAnotherCurrencies" should "convertEuro into rupees" in {
    val actualResult = currency.euroTo(5, "Rupees")
    val expectedResult = 400
    assert(expectedResult == actualResult)
  }

  "convertEuroIntoAnotherCurrencies" should "convert Euro into Riyal  sterling" in {
    val actualResult = currency.euroTo(5, "Riyal")
    val expectedResult =  20.55
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert Euro into yen" in {
    val actualResult = currency.euroTo(5, "Yen")
    val expectedResult = 636.5999999999999
    assert(expectedResult == actualResult)
  }
  "converEuroIntoAnotherCurrencies" should "convertEuro into canadian" in {
    try {
      val actualResult = currency.euroTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertEuroIntoAnotherCurrencies" should "convert Euro into ringgit" in {
    val actualResult = currency.euroTo(5, "Ringgit")
    val expectedResult = 23.900000000000002
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert Euro into Franc" in {
    val actualResult = currency.euroTo(5, "Franc")
    val expectedResult = 5.3500000000000005
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert Euro into Dinar" in {
    val actualResult = currency.euroTo(5, "Dinar")
    val expectedResult = 1.6500000000000001
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert Euro into Yuan" in {
    val actualResult = currency.euroTo(5, "Yuan")
    val expectedResult = 38.3
    assert(expectedResult == actualResult)
  }
  "convertEuroIntoAnotherCurrencies" should "convert Euro into dollor" in {
    val actualResult = currency.euroTo(5, "Dollar")
    val expectedResult = 5.699999999999999
    assert(expectedResult == actualResult)
  }

  //////////////////////////////////////////////////


  "convertYenIntoAnotherCurrencies" should "convertYen into rupees" in {
    val actualResult = currency.yenTo(5, "Rupees")
    val expectedResult = 3.15
    assert(expectedResult == actualResult)
  }

  "convertYenIntoAnotherCurrencies" should "convert Yen into Riyal  sterling" in {
    val actualResult = currency.yenTo(5, "Riyal")
    val expectedResult =  0.17
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert Yen into Euro" in {
    val actualResult = currency.yenTo(5, "Euro")
    val expectedResult = 714.2857142857142
    assert(expectedResult == actualResult)
  }
  "converYenIntoAnotherCurrencies" should "convertYen into canadian" in {
    try {
      val actualResult = currency.yenTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertYenIntoAnotherCurrencies" should "convert Yeno into ringgit" in {
    val actualResult = currency.yenTo(5, "Ringgit")
    val expectedResult = 0.185
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert Yen into Franc" in {
    val actualResult = currency.yenTo(5, "Franc")
    val expectedResult = 0.0445
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert Yen into Dinar" in {
    val actualResult = currency.yenTo(5, "Dinar")
    val expectedResult = 0.014
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convertYen into Yuan" in {
    val actualResult = currency.yenTo(5, "Yuan")
    val expectedResult = 0.32
    assert(expectedResult == actualResult)
  }
  "convertYenIntoAnotherCurrencies" should "convert Yeninto dollor" in {
    val actualResult = currency.yenTo(5, "Dollar")
    val expectedResult = 0.04
    assert(expectedResult == actualResult)
  }

//////////////////////////////////////


  "convertRinggitIntoAnotherCurrencies" should "convertRinggit into rupees" in {
    val actualResult = currency.yenTo(5, "Rupees")
    val expectedResult = 3.15
    assert(expectedResult == actualResult)
  }

  "convertringgitIntoAnotherCurrencies" should "convert ringgit into Riyal  sterling" in {
    val actualResult = currency.ringgitTo(5, "Riyal")
    val expectedResult = 4.5
    assert(expectedResult == actualResult)
  }
  "convertringgitIntoAnotherCurrencies" should "convert ringgit into ringgit" in {
    val actualResult = currency.ringgitTo(5, "Euro")
    val expectedResult = 23.923444976076556
    assert(expectedResult == actualResult)
  }
  "converringgitIntoAnotherCurrencies" should "convertringgit into canadian" in {
    try {
      val actualResult = currency.ringgitTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertringgitIntoAnotherCurrencies" should "convert ringgit o into yen" in {
    val actualResult = currency.ringgitTo(5, "Yen")
    val expectedResult = 133.15
    assert(expectedResult == actualResult)
  }
  "convertringgitIntoAnotherCurrencies" should "convert ringgit into Franc" in {
    val actualResult = currency.ringgitTo(5, "Franc")
    val expectedResult = 1.2
    assert(expectedResult == actualResult)
  }
  "convertringgitIntoAnotherCurrencies" should "convert ringgit into Dinar" in {
    val actualResult = currency.ringgitTo(5, "Dinar")
    val expectedResult = 0.365
    assert(expectedResult == actualResult)
  }
  "convertringgitIntoAnotherCurrencies" should "convertringgit into Yuan" in {
    val actualResult = currency.ringgitTo(5, "Yuan")
    val expectedResult = 8.45
    assert(expectedResult == actualResult)
  }
  "convertringgitIntoAnotherCurrencies" should "convert ringgitinto dollor" in {
    val actualResult = currency.ringgitTo(5, "Dollar")
    val expectedResult = 1.1949999999999998
    assert(expectedResult == actualResult)
  }


/////////////////////////////////////////

  "convertfrancIntoAnotherCurrencies" should "convertfranc into rupees" in {
    val actualResult = currency.francTo(5, "Rupees")
    val expectedResult = 365.25
    assert(expectedResult == actualResult)
  }

  "convertfrancIntoAnotherCurrencies" should "convert franc into Riyal  sterling" in {
    val actualResult = currency.francTo(5, "Riyal")
    val expectedResult = 19.2
    assert(expectedResult == actualResult)
  }
  "convertfrancIntoAnotherCurrencies" should "convert franc into Euro" in {
    val actualResult = currency.francTo(5, "Euro")
    val expectedResult = 5.376344086021505
    assert(expectedResult == actualResult)
  }
  "convert franc IntoAnotherCurrencies" should "convert franc into canadian" in {
    try {
      val actualResult = currency.francTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertfrancIntoAnotherCurrencies" should "convert franc o into yen" in {
    val actualResult = currency.francTo(5, "Yen")
    val expectedResult = 561.75
    assert(expectedResult == actualResult)
  }
  "convertfrancIntoAnotherCurrencies" should "convert franc into ringgit" in {
    val actualResult = currency.francTo(5, "Ringgit")
    val expectedResult =21.200000000000003
    assert(expectedResult == actualResult)
  }
  "convertfrancIntoAnotherCurrencies" should "convert franc into Dinar" in {
    val actualResult = currency.francTo(5, "Dinar")
    val expectedResult =1.55
    assert(expectedResult == actualResult)
  }
  "convertfrancIntoAnotherCurrencies" should "convertfranc into Yuan" in {
    val actualResult = currency.francTo(5, "Yuan")
    val expectedResult = 35.8
    assert(expectedResult == actualResult)
  }
  "convertfranc IntoAnotherCurrencies" should "convert franc into dollor" in {
    val actualResult = currency.francTo(5, "Dollar")
    val expectedResult = 5.1
    assert(expectedResult == actualResult)
  }


  /////////////////////////////////////////

  "convertdinarIntoAnotherCurrencies" should "convertdinar into rupees" in {
    val actualResult = currency.dinarTo(5, "Rupees")
    val expectedResult = 1172.7
    assert(expectedResult == actualResult)
  }

  "convertdinarIntoAnotherCurrencies" should "convert dinar into Riyal  sterling" in {
    val actualResult = currency.dinarTo(5, "Riyal")
    val expectedResult = 61.65
    assert(expectedResult == actualResult)
  }
  "convertdinarIntoAnotherCurrencies" should "convert dinar into Euro" in {
    val actualResult = currency.dinarTo(5, "Euro")
    val expectedResult = 1.6666666666666667
    assert(expectedResult == actualResult)
  }
  "convert dinar IntoAnotherCurrencies" should "convert dinar into canadian" in {
    try {
      val actualResult = currency.dinarTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertdinarIntoAnotherCurrencies" should "convert dinar o into yen" in {
    val actualResult = currency.dinarTo(5, "Yen")
    val expectedResult = 1803.7
    assert(expectedResult == actualResult)
  }
  "convertdinarIntoAnotherCurrencies" should "convert dinar into ringgit" in {
    val actualResult = currency.dinarTo(5, "Ringgit")
    val expectedResult =68.15
    assert(expectedResult == actualResult)
  }
  "convertdinarIntoAnotherCurrencies" should "convert dinar into franc" in {
    val actualResult = currency.dinarTo(5, "Franc")
    val expectedResult =16.05
    assert(expectedResult == actualResult)
  }
  "convertdinarIntoAnotherCurrencies" should "convertdinar into Yuan" in {
    val actualResult = currency.dinarTo(5, "Yuan")
    val expectedResult = 114.85
    assert(expectedResult == actualResult)
  }
  "convertdinar IntoAnotherCurrencies" should "convert dinar into dollor" in {
    val actualResult = currency.dinarTo(5, "Dollar")
    val expectedResult = 16.45
    assert(expectedResult == actualResult)
  }


  /////////////////////////////////////////


  "convertyuanIntoAnotherCurrencies" should "convertyuan into rupees" in {
    val actualResult = currency.yuanTo(5, "Rupees")
    val expectedResult = 51.050000000000004
    assert(expectedResult == actualResult)
  }

  "convertyuanIntoAnotherCurrencies" should "convert yuan into Riyal  sterling" in {
    val actualResult = currency.yuanTo(5, "Riyal")
    val expectedResult = 2.7
    assert(expectedResult == actualResult)
  }
  "convertyuanIntoAnotherCurrencies" should "convert yuan into Euro" in {
    val actualResult = currency.yuanTo(5, "Euro")
    val expectedResult = 38.46153846153846
    assert(expectedResult == actualResult)
  }
  "convert yuan IntoAnotherCurrencies" should "convert yuan into canadian" in {
    try {
      val actualResult = currency.yuanTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertyuanIntoAnotherCurrencies" should "convert yuan o into yen" in {
    val actualResult = currency.yuanTo(5, "Yen")
    val expectedResult = 78.7
    assert(expectedResult == actualResult)
  }
  "convertyuanIntoAnotherCurrencies" should "convert yuan into ringgit" in {
    val actualResult = currency.yuanTo(5, "Ringgit")
    val expectedResult =2.9499999999999997
    assert(expectedResult == actualResult)
  }
  "convertyuanIntoAnotherCurrencies" should "convert yuan into franc" in {
    val actualResult = currency.yuanTo(5, "Franc")
    val expectedResult = 0.7000000000000001
    assert(expectedResult == actualResult)
  }
  "convertyuanIntoAnotherCurrencies" should "convertyuan into dinar" in {
    val actualResult = currency.yuanTo(5, "Dinar")
    val expectedResult = 0.21999999999999997
    assert(expectedResult == actualResult)
  }
  "convertyuan IntoAnotherCurrencies" should "convert yuan into dollor" in {
    val actualResult = currency.yuanTo(5, "Dollar")
    val expectedResult =  0.7000000000000001
    assert(expectedResult == actualResult)
  }


  //////////////////////////////


  "convertriyalIntoAnotherCurrencies" should "convert riyal into rupees" in {
    val actualResult = currency.riyalTo(5, "Rupees")
    val expectedResult = 95.1
    assert(expectedResult == actualResult)
  }

  "convertriyalIntoAnotherCurrencies" should "convert riyal into yuan  sterling" in {
    val actualResult = currency.riyalTo(5, "Yuan")
    val expectedResult = 9.3
    assert(expectedResult == actualResult)
  }
  "convertriyalIntoAnotherCurrencies" should "convert riyal into Euro" in {
    val actualResult = currency.riyalTo(5, "Euro")
    val expectedResult = 20.833333333333336
    assert(expectedResult == actualResult)
  }
  "convert riyal IntoAnotherCurrencies" should "convert riyal into canadian" in {
    try {
      val actualResult = currency.riyalTo(5, "Canadian")
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid currency")
      }
    }
  }

  "convertriyalIntoAnotherCurrencies" should "convert riyal o into yen" in {
    val actualResult = currency.riyalTo(5, "Yen")
    val expectedResult = 146.3
    assert(expectedResult == actualResult)
  }
  "convertriyalIntoAnotherCurrencies" should "convert riyal into ringgit" in {
    val actualResult = currency.riyalTo(5, "Ringgit")
    val expectedResult =5.550000000000001
    assert(expectedResult == actualResult)
  }
  "convertriyalIntoAnotherCurrencies" should "convert riyal into franc" in {
    val actualResult = currency.riyalTo(5, "Franc")
    val expectedResult =1.3
    assert(expectedResult == actualResult)
  }
  "convertriyalIntoAnotherCurrencies" should "convertriyal into dinar" in {
    val actualResult = currency.riyalTo(5, "Dinar")
    val expectedResult =0.405
    assert(expectedResult == actualResult)
  }
  "convertriyal IntoAnotherCurrencies" should "convert riyal into dollor" in {
    val actualResult = currency.riyalTo(5, "Dollar")
    val expectedResult =  1.35
    assert(expectedResult == actualResult)
  }


  //////////////////////////////
}