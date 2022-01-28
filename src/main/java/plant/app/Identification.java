package plant.app;

import java.util.Scanner;

/**
 * This is the class containing all methods to identify plants in this app. This is strictly logic and contains
 * no JavaFX elements/methods.
 */
public class Identification {
    public Object getType() {
        if (isMushroom()) {
            return getMushroom();
        } else if (isFlower()) {
            return getFlower();
        } else if (isAlgae()) {
            return getAlgae();
        } else if (isSucculent()) {
            return getSucculent();
        } else if (isCactus()) {
            return getCactus();
        } else {
            return null;
        }
    }

    /**
     * @return this method returns a boolean to determine whether the plant is a mushroom or not.
     * By determining whether a plant* looks like it's wearing a hat, you can pretty much tell, if it's
     * a mushroom or not.
     * (*biologically, mushrooms are not plants, but for my explanation's sake, I will refer to mushroom's
     * super-class as plants rather than fungi)
     */
    public static boolean isMushroom() {
        boolean wearsHat;
        System.out.println("Does the plant look like it's wearing a hat?");
        Scanner input = new Scanner(System.in);
        return input.nextInt() == 1;
    }

    /**
     * @return this method returns a mushroom with the fitting attributes.
     */
    public static Mushroom getMushroom() {
        Scanner input = new Scanner(System.in);
        System.out.println("What color does the mushroom mainly have?");
        String color = input.nextLine();
        return new Mushroom(color);
    }

    /**
     * @return this method returns a boolean to determine whether the plant is a flower or not.
     * By determining whether a plant has a blossom, we can determine if it's a flower.
     */
    public static boolean isFlower() {
        Scanner input = new Scanner(System.in);
        System.out.println("Does the plant have a blossom?");
        return input.nextInt() == 1;
    }

    /**
     * @return this method returns a flower with the data that the user inputs, resp. if the plant is a flower some
     * values can be set already, e.g. hasFruit can be set to false since flowers can technically carry fruit,
     * but this is a simple app to identify types of plants with simple questions.
     */
    public static Flower getFlower() {
        Scanner input = new Scanner(System.in);
        System.out.println("What color does the blossom have?");
        String color = input.nextLine();
        System.out.println("About how long is the stem? (full centimetres, no comma values)");
        int length = input.nextInt();
        System.out.println("Does the flower have leaves?");
        boolean hasLeaves;
        hasLeaves = input.nextInt() == 1;
        System.out.println("How many petals does the flower have?");
        int numberOfPetals = input.nextInt();
        return new Flower(color, length, false, hasLeaves, true, numberOfPetals);
    }

    /**
     * @return this method returns a boolean on whether a plant belongs to the subclass Algae or not.
     * Since Algae mainly looks like underwater grass, this is the attribute I'm using to identify it with.
     */
    public static boolean isAlgae() {
        Scanner input = new Scanner(System.in);
        System.out.println("Does the plant look like underwater grass?");
        return input.nextInt() == 1;
    }

    /**
     * @return this method returns an Algae plant with attributes defined by the user. Some attributes have been set
     * by me, since some attributes are already clear, i.e. Algae don't carry fruit, and they don't have blossoms.
     */
    public static Algae getAlgae() {
        Scanner input = new Scanner(System.in);
        System.out.println("What color is the Algae?");
        String color = input.nextLine();
        System.out.println("How long is it? (length in full centimetres, no comma values)");
        int length = input.nextInt();
        System.out.println("Is the Algae toxic? (Can be seen if clear water turns a milky toxic green with the Algae in it)");
        boolean isToxic = input.nextInt() == 1;
        return new Algae(color, length, false, false, false, isToxic);
    }

    /**
     * @return this method returns a boolean on the plant is a succulent. Succulents are usually identified by their
     * thick, fleshy stem, root and leaves, so we're using that as well.
     */
    public static boolean isSucculent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Are the stem/root and the leaves of the plant really thick and fleshy?");
        return input.nextInt() == 1;
    }

    /**
     * @return this method returns a succulent with the attributes the user set, besides the color (since succulents
     * only have a different color from green if they're stressed, but that is not relevant while identifying
     * the plant).
     * Succulents can carry blossoms, fruit and spikes. Naturally they have leaves since their stem/root and their
     * leaves sort of merge into one.
     */
    public static Succulent getSucculent() {
        Scanner input = new Scanner(System.in);
        System.out.println("How big is the succulent? (Full centimetres, no comma values)");
        int length = input.nextInt();
        System.out.println("Does the succulent carry fruit?");
        boolean hasFruit = input.nextInt() == 1;
        System.out.println("Does the succulent carry blossoms?");
        boolean hasBlossom = input.nextInt() == 1;
        System.out.println("Does the succulent have spikes?");
        boolean hasSpikes = input.nextInt() == 1;
        return new Succulent("green", length, hasFruit, true, hasBlossom, hasSpikes);
    }

    /**
     * @return this method returns a boolean to determine whether a plant is a cactus. Cacti are usually identified by
     * their thick, fleshy stem, root and leaves, like succulents. The difference is, though, that cacti have little
     * dark bumps where spikes come out, which we're using to differentiate between succulents and cacti.
     */
    public static boolean isCactus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Are the stem/root and the leaves of the plant really thick and fleshy?");
        if (input.nextInt() == 1) {
            System.out.println("Does the succulent have little dark bumps with spikes coming out of it?");
            return input.nextInt() == 1;
        } else {
            return false;
        }
    }

    /**
     * @return this method returns a cactus with the attributes set by the user. These are basically the same
     * attributes as the succulents have, but with different outputs.
     * In my documentation there is an attempt at combining both methods to create one bigger method, but this would've
     * led to longer code altogether (through parsing and representing objects as strings).
     */
    public static Cactus getCactus() {
        Scanner input = new Scanner(System.in);
        System.out.println("How big is the cactus? (Full centimetres, no comma values)");
        int length = input.nextInt();
        System.out.println("Does the cactus carry fruit?");
        boolean hasFruit = input.nextInt() == 1;
        System.out.println("Does the cactus carry blossoms?");
        boolean hasBlossom = input.nextInt() == 1;
        System.out.println("Does the cactus have spikes?");
        boolean hasSpikes = input.nextInt() == 1;
        return new Cactus("green", length, hasFruit, true, hasBlossom, hasSpikes);
    }
}