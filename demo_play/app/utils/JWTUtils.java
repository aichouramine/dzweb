package utils;

import java.util.HashMap;

import javax.xml.bind.DatatypeConverter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import play.libs.Json;

public class JWTUtils {

	@SuppressWarnings("serial")
	public static String generateJWT(final Object object) {
		String result = "";
		try {
			result = Jwts.builder().setClaims(new HashMap<String, Object>() {
				{
					put("json", Json.toJson(object));
				}
			}).signWith(SignatureAlgorithm.HS256, "secret").compact();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static boolean validateJWT(String jwt) {
		boolean result = false;
		try {
			Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary("secret"))
					.parseClaimsJws(jwt).getBody();
			result = true;
		} catch (SignatureException | MalformedJwtException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return result;
	}
}
