package particles;

public class ParticleTexture {
	private int textureID;
	private int numberOfRows;
	private boolean isAdditive;

	public ParticleTexture(int textureID, int numberOfRows) {
		this.textureID = textureID;
		this.numberOfRows = numberOfRows;
	}

	public int getTextureID() {
		return textureID;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public boolean isAdditive() {
		return isAdditive;
	}
	
}
