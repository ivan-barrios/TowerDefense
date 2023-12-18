package game.components;

import game.attacks.Attack;
import game.types.Type;

import java.util.List;

import javax.swing.ImageIcon;

public abstract class Monster {

    protected Integer life;
    protected Attack activeSkill;
    private Player player;
    protected String monsterName;
    protected List<Type> types;
    protected ImageIcon linkToImage;
    
    public abstract void attack(Monster monster);

    public void onDamageReceive(Integer damage, Monster monster) {
        this.life = this.life - damage;
        if(this.life < 0) {
            this.life = 0;
        }
        System.out.println(this + " fue herido, queda con " + this.life + " puntos de vida");
    }

    public void move(PathBox oldPathBox, PathBox newPathBox) {
        oldPathBox.setMonster(null);
        newPathBox.setMonster(this);
    }

    public Integer getLife() {
        return life;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Type> getTypes() {
        return types;
    }

    public ImageIcon getLinkToImage() {
		return linkToImage;
	}

	public void setLinkToImage(ImageIcon linkToImage) {
		this.linkToImage = linkToImage;
	}

	@Override
    public String toString() {
        return monsterName;
    }

}
