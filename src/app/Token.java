package app;

import java.util.UUID;

public class Token {
	private UUID signature;

	public Token( String signature ) {
		this(UUID.fromString(signature));
	}

	public Token() {
		this(UUID.randomUUID());
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof ClaimToken ) {
			return this.signature.equals(((Token)obj).signature);
		}
		return false;
	}
	@Override
	public String toString() {
		return signature.toString();
	}

	private Token( UUID signature ) {
		this.signature = signature;
	}
}
