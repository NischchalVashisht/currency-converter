package com.knoldus

/**
 * this class represent the basic functionality of Converting ccurrency
 */

class CurrencyConv {
  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */
  def inrTo(amount: Double, convertTo: String): Float = {
    convertTo match {
      case "Dollar" => (amount / 70).toFloat
      case "Pound" => (amount / 88).toFloat
      case "Euro" => (amount / 80).toFloat
      case "Yen" => (amount / 0.63).toFloat
      case "Ringgit" => (amount / 16).toFloat
      case "Franc" => (amount * 0.014).toFloat
      case "Dinar" => (amount * 0.0043).toFloat
      case "Yuan" => (amount * 0.098).toFloat
      case "Riyal" => (amount * 0.053).toFloat
      case _ => throw new Exception("invalid currency")
    }

  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def dollorTo(amount: Double, convertTo: String): Float = {

    convertTo match {
      case "Rupees" => (amount * 70).toFloat
      case "Pound" => (amount * 0.78).toFloat
      case "Euro" => (amount * 0.87).toFloat
      case "Yen" => (amount * 111.087).toFloat
      case "Ringgit" => (amount * 4.17).toFloat
      case "Franc" => (amount * 0.98).toFloat
      case "Dinar" => (amount * 0.30).toFloat
      case "Yuan" => (amount * 6.99).toFloat
      case "Riyal" => (amount * 3.75).toFloat
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def poundTo(amount: Double, convertTo: String): Double = {

    convertTo match {

      case "Rupees" => amount * 88
      case "Dollar" => amount * 1.26
      case "Euro" => amount * 1.1
      case "Yen" => amount * 5.29
      case "Ringgit" => amount * 0.98
      case "Franc" => amount * 1.26
      case "Dinar" => amount * 0.39
      case "Yuan" => amount * 9.02
      case "Riyal" => amount * 4.84
      case _ => throw new Exception("invalid currency")
    }

  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */


  def euroTo(amount: Double, convertTo: String): Double = {

    convertTo match {
      case "Rupees" => amount * 80
      case "Dollar" => amount * 1.14
      case "Pound" => amount * 0.90
      case "Yen" => amount * 127.32
      case "Ringgit" => amount * 4.78
      case "Franc" => amount * 1.07
      case "Dinar" => amount * 0.33
      case "Yuan" => amount * 7.66
      case "Riyal" => amount * 4.11
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def yenTo(amount: Double, convertTo: String): Double = {

    convertTo match {
      case "Rupees" => amount * 0.63
      case "Dollar" => amount * 0.008
      case "Pound" => amount * 0.007
      case "Euro" => amount / 0.007
      case "Ringgit" => amount * 0.037
      case "Franc" => amount * 0.0089
      case "Dinar" => amount * 0.0028
      case "Yuan" => amount * 0.064
      case "Riyal" => amount * 0.034
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def ringgitTo(amount: Double, convertTo: String): Double = {

    convertTo match {
      case "Rupees" => amount * 16.8
      case "Dollar" => amount * 0.239
      case "Pound" => amount * 0.188
      case "Euro" => amount / 0.209
      case "Yen" => amount * 26.63
      case "Franc" => amount * 0.24
      case "Dinar" => amount * 0.073
      case "Yuan" => amount * 1.69
      case "Riyal" => amount * 0.90
      case _ => throw new Exception("invalid currency")

    }
  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def francTo(amount: Double, convertTo: String): Double = {
    convertTo match {
      case "Rupees" => amount * 73.05
      case "Dollar" => amount * 1.02
      case "Pound" => amount * 0.79
      case "Euro" => amount / 0.93
      case "Yen" => amount * 112.35
      case "Ringgit" => amount * 4.24
      case "Dinar" => amount * 0.31
      case "Yuan" => amount * 7.16
      case "Riyal" => amount * 3.84
      case _ => throw new Exception("invalid currency")


    }
  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def dinarTo(amount: Double, convertTo: String): Double = {
    convertTo match {
      case "Rupees" => amount * 234.54
      case "Dollar" => amount * 3.29
      case "Pound" => amount * 2.55
      case "Euro" => amount / 3
      case "Yen" => amount * 360.74
      case "Ringgit" => amount * 13.63
      case "Franc" => amount * 3.21
      case "Yuan" => amount * 22.97
      case "Riyal" => amount * 12.33
      case _ => throw new Exception("invalid currency")
    }


  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def yuanTo(amount: Double, convertTo: String): Double = {
    convertTo match {
      case "Rupees" => amount * 10.21
      case "Dollar" => amount * 0.14
      case "Pound" => amount * 0.11
      case "Euro" => amount / 0.13
      case "Yen" => amount * 15.74
      case "Ringgit" => amount * 0.59
      case "Franc" => amount * 0.14
      case "Dinar" => amount * 0.044
      case "Riyal" => amount * 0.54
      case _ => throw new Exception("invalid currency")
    }
  }

  /**
   *
   * @param amount    amoutuser want to change
   * @param convertTo a method which convert it to specific currency
   * @return ractually returns the updated amount
   */

  def riyalTo(amount: Double, convertTo: String): Double = {
    convertTo match {
      case "Rupees" => amount * 19.02
      case "Dollar" => amount * 0.27
      case "Pound" => amount * 0.21
      case "Euro" => amount / 0.24
      case "Yen" => amount * 29.26
      case "Ringgit" => amount * 1.11
      case "Franc" => amount * 0.26
      case "Dinar" => amount * 0.081
      case "Yuan" => amount * 1.86
      case _ => throw new Exception("invalid currency")
    }
  }

}





