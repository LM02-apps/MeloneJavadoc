/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @since JDK 1.0
 * 
 */
public class URLEncoder 
{
    public static String encode (String s)
    {
        return s;
        /**
 *
 * @deprecated The resulting string may vary depending on the platform's default encoding. Instead, use the encode (String,String) method to specify the encoding. Translates a string into x-www-form-urlencoded format. This method uses the platform's default encoding as the encoding scheme to obtain the bytes for unsafe characters.
 * @param s - string to be translated.
 * @return  URLDecoder.decode(java.lang.String, java.lang.String)
 * @
 * 
 */        

    }
    public static String encode (String s, String enc)
    {
        
        return s;
        /**
 *
 * 
 * 
 * @param s - String to be translated.
 * @param enc - The name of a supported character encoding.
 * @return the translated String
 * @throws UnsupportedEncodingException - If the named encoding is not supported
 * @since 1.4
 * @see  URLDecoder.decode(java.lang.String, java.lang.String)
 */
    }
}
