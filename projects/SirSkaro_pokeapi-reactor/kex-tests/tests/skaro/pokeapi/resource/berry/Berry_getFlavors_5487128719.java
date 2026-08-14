package skaro.pokeapi.resource.berry;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Berry_getFlavors_5487128719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3502;

    public Berry_getFlavors_5487128719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3503 = new Integer(389427431);
        Integer term3517 = new Integer(-1945706126);
        Integer term3519 = new Integer(1152356969);
        Integer term3521 = new Integer(-1667990367);
        Integer term3523 = new Integer(-1214628358);
        Integer term3525 = new Integer(1102721075);
        Integer term3527 = new Integer(-426764678);
        Integer term3557 = new Integer(-1222614956);
        Object term3556 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3559 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3556, term3556.getClass(), "potency", term3557);
        setField(term3559, term3559.getClass(), "name", null);
        setField(term3559, term3559.getClass(), "url", null);
        setField(term3556, term3556.getClass(), "flavor", term3559);
        Integer term3561 = new Integer(-1870495012);
        Object term3560 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3563 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3560, term3560.getClass(), "potency", term3561);
        setField(term3563, term3563.getClass(), "name", null);
        setField(term3563, term3563.getClass(), "url", null);
        setField(term3560, term3560.getClass(), "flavor", term3563);
        Integer term3565 = new Integer(-1310015129);
        Object term3564 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3567 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3564, term3564.getClass(), "potency", term3565);
        setField(term3567, term3567.getClass(), "name", null);
        setField(term3567, term3567.getClass(), "url", null);
        setField(term3564, term3564.getClass(), "flavor", term3567);
        Integer term3569 = new Integer(-2104981311);
        Object term3568 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3571 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3568, term3568.getClass(), "potency", term3569);
        setField(term3571, term3571.getClass(), "name", null);
        setField(term3571, term3571.getClass(), "url", null);
        setField(term3568, term3568.getClass(), "flavor", term3571);
        Integer term3573 = new Integer(-571169753);
        Object term3572 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3575 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3572, term3572.getClass(), "potency", term3573);
        setField(term3575, term3575.getClass(), "name", null);
        setField(term3575, term3575.getClass(), "url", null);
        setField(term3572, term3572.getClass(), "flavor", term3575);
        Integer term3577 = new Integer(318591690);
        Object term3576 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3579 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3576, term3576.getClass(), "potency", term3577);
        setField(term3579, term3579.getClass(), "name", null);
        setField(term3579, term3579.getClass(), "url", null);
        setField(term3576, term3576.getClass(), "flavor", term3579);
        Integer term3581 = new Integer(-165587447);
        Object term3580 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3583 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3580, term3580.getClass(), "potency", term3581);
        setField(term3583, term3583.getClass(), "name", null);
        setField(term3583, term3583.getClass(), "url", null);
        setField(term3580, term3580.getClass(), "flavor", term3583);
        Integer term3585 = new Integer(-1347358701);
        Object term3584 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3587 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3584, term3584.getClass(), "potency", term3585);
        setField(term3587, term3587.getClass(), "name", null);
        setField(term3587, term3587.getClass(), "url", null);
        setField(term3584, term3584.getClass(), "flavor", term3587);
        ArrayList term3554 = new ArrayList();
        ((ArrayList) term3554).add(term3556);
        ((ArrayList) term3554).add(term3560);
        ((ArrayList) term3554).add(term3564);
        ((ArrayList) term3554).add(term3568);
        ((ArrayList) term3554).add(term3572);
        ((ArrayList) term3554).add(term3576);
        ((ArrayList) term3554).add(term3580);
        ((ArrayList) term3554).add(term3584);
        term3502 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term3529 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3590 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3502, term3502.getClass(), "id", term3503);
        setField(term3502, term3502.getClass(), "name", "CGOpQSZZwI");
        setField(term3502, term3502.getClass(), "growthTime", term3517);
        setField(term3502, term3502.getClass(), "maxHarvest", term3519);
        setField(term3502, term3502.getClass(), "naturalGiftPower", term3521);
        setField(term3502, term3502.getClass(), "size", term3523);
        setField(term3502, term3502.getClass(), "smoothness", term3525);
        setField(term3502, term3502.getClass(), "soilDryness", term3527);
        setField(term3529, term3529.getClass(), "name", "ypEdrstygY");
        setField(term3529, term3529.getClass(), "url", "sNQFlATEeQ");
        setField(term3502, term3502.getClass(), "firmness", term3529);
        setField(term3502, term3502.getClass(), "flavors", term3554);
        setField(term3590, term3590.getClass(), "name", "pXdglvyrQe");
        setField(term3590, term3590.getClass(), "url", "OcfNzHYdki");
        setField(term3502, term3502.getClass(), "item", term3590);
        setField(term3502, term3502.getClass(), "naturalGiftType", term3583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavors", argTypes, term3502, args);
    }

};


