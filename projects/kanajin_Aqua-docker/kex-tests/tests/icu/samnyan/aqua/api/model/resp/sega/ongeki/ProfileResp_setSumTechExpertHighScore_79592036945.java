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
import java.lang.Long;

public class ProfileResp_setSumTechExpertHighScore_79592036945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98411;
     Object term98450;

    public ProfileResp_setSumTechExpertHighScore_79592036945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98411 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98411, term98411.getClass(), "userName", "IhcEHpXkob");
        setIntField(term98411, term98411.getClass(), "level", -1409600010);
        setLongField(term98411, term98411.getClass(), "exp", 4204446600829498873L);
        setLongField(term98411, term98411.getClass(), "point", 7261930415384168406L);
        setLongField(term98411, term98411.getClass(), "totalPoint", 284407895381973861L);
        setIntField(term98411, term98411.getClass(), "playCount", -727597571);
        setIntField(term98411, term98411.getClass(), "jewelCount", 501718246);
        setIntField(term98411, term98411.getClass(), "totalJewelCount", 1801903852);
        setIntField(term98411, term98411.getClass(), "playerRating", -65673880);
        setIntField(term98411, term98411.getClass(), "highestRating", 1228502823);
        setIntField(term98411, term98411.getClass(), "battlePoint", 199333488);
        setIntField(term98411, term98411.getClass(), "nameplateId", 1821842532);
        setIntField(term98411, term98411.getClass(), "trophyId", -1914308877);
        setIntField(term98411, term98411.getClass(), "cardId", -1374025729);
        setIntField(term98411, term98411.getClass(), "characterId", -1570135661);
        setLongField(term98411, term98411.getClass(), "sumTechHighScore", 5812631139346531212L);
        setLongField(term98411, term98411.getClass(), "sumTechBasicHighScore", 630357306867194790L);
        setLongField(term98411, term98411.getClass(), "sumTechAdvancedHighScore", 4853024974865293806L);
        setLongField(term98411, term98411.getClass(), "sumTechExpertHighScore", 4963556831644279467L);
        setLongField(term98411, term98411.getClass(), "sumTechMasterHighScore", 6827756407148809342L);
        setLongField(term98411, term98411.getClass(), "sumTechLunaticHighScore", -6279272390622510968L);
        setLongField(term98411, term98411.getClass(), "sumBattleHighScore", -7083639040362932921L);
        setLongField(term98411, term98411.getClass(), "sumBattleBasicHighScore", -945372690225290924L);
        setLongField(term98411, term98411.getClass(), "sumBattleAdvancedHighScore", 3627823862949907304L);
        setLongField(term98411, term98411.getClass(), "sumBattleExpertHighScore", -4318897785943810220L);
        setLongField(term98411, term98411.getClass(), "sumBattleMasterHighScore", 6332564091028476882L);
        setLongField(term98411, term98411.getClass(), "sumBattleLunaticHighScore", -8468127981775383720L);
        term98450 = new Long(-4022913440181089712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98450;
        callMethod(klass, "setSumTechExpertHighScore", argTypes, term98411, args);
    }

};


