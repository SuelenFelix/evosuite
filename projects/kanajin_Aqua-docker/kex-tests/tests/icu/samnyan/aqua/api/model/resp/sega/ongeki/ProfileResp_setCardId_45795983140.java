package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ProfileResp_setCardId_45795983140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98156;
     Object term98195;

    public ProfileResp_setCardId_45795983140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98156 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98156, term98156.getClass(), "userName", "wnxOndGYJi");
        setIntField(term98156, term98156.getClass(), "level", 1050866203);
        setLongField(term98156, term98156.getClass(), "exp", 3698167453738514698L);
        setLongField(term98156, term98156.getClass(), "point", 3893749781941066423L);
        setLongField(term98156, term98156.getClass(), "totalPoint", 6807296582805319307L);
        setIntField(term98156, term98156.getClass(), "playCount", -656067139);
        setIntField(term98156, term98156.getClass(), "jewelCount", -1527456464);
        setIntField(term98156, term98156.getClass(), "totalJewelCount", -86199518);
        setIntField(term98156, term98156.getClass(), "playerRating", 918502014);
        setIntField(term98156, term98156.getClass(), "highestRating", -912701929);
        setIntField(term98156, term98156.getClass(), "battlePoint", -953984612);
        setIntField(term98156, term98156.getClass(), "nameplateId", 68433516);
        setIntField(term98156, term98156.getClass(), "trophyId", -1342172889);
        setIntField(term98156, term98156.getClass(), "cardId", 187925959);
        setIntField(term98156, term98156.getClass(), "characterId", 475145690);
        setLongField(term98156, term98156.getClass(), "sumTechHighScore", -6973513350312993881L);
        setLongField(term98156, term98156.getClass(), "sumTechBasicHighScore", 8559326440221191693L);
        setLongField(term98156, term98156.getClass(), "sumTechAdvancedHighScore", -7319992795474227745L);
        setLongField(term98156, term98156.getClass(), "sumTechExpertHighScore", 8562150791832814583L);
        setLongField(term98156, term98156.getClass(), "sumTechMasterHighScore", 2029233416534236849L);
        setLongField(term98156, term98156.getClass(), "sumTechLunaticHighScore", -4979285821366810599L);
        setLongField(term98156, term98156.getClass(), "sumBattleHighScore", 6383198918476424929L);
        setLongField(term98156, term98156.getClass(), "sumBattleBasicHighScore", -1185168739583572533L);
        setLongField(term98156, term98156.getClass(), "sumBattleAdvancedHighScore", -4221295278052243097L);
        setLongField(term98156, term98156.getClass(), "sumBattleExpertHighScore", 1908480098967503445L);
        setLongField(term98156, term98156.getClass(), "sumBattleMasterHighScore", 1939409221013600883L);
        setLongField(term98156, term98156.getClass(), "sumBattleLunaticHighScore", 6650512235487380881L);
        term98195 = new Integer(-672313691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term98195;
        callMethod(klass, "setCardId", argTypes, term98156, args);
    }

};


