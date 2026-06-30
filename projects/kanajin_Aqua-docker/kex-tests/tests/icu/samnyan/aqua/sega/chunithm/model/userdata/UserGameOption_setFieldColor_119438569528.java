package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setFieldColor_119438569528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61751;
     Object term62051;

    public UserGameOption_setFieldColor_119438569528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61757 = new Long(-3936701866695933852L);
        term61751 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term61753 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term61755 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61808 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61869 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61963 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61751, term61751.getClass(), "id", 1959851788493022882L);
        setLongField(term61753, term61753.getClass(), "id", -8272873308287230741L);
        setLongField(term61755, term61755.getClass(), "id", -1471967517386315328L);
        setField(term61755, term61755.getClass(), "extId", term61757);
        setField(term61755, term61755.getClass(), "luid", "XETimBHIKG");
        setIntField(term61772, term61772.getClass(), "year", 2022);
        setShortField(term61772, term61772.getClass(), "month", (short) 11);
        setShortField(term61772, term61772.getClass(), "day", (short) 16);
        setField(term61771, term61771.getClass(), "date", term61772);
        setByteField(term61776, term61776.getClass(), "hour", (byte) 12);
        setByteField(term61776, term61776.getClass(), "minute", (byte) 41);
        setByteField(term61776, term61776.getClass(), "second", (byte) 8);
        setIntField(term61776, term61776.getClass(), "nano", 873900846);
        setField(term61771, term61771.getClass(), "time", term61776);
        setField(term61755, term61755.getClass(), "registerTime", term61771);
        setIntField(term61782, term61782.getClass(), "year", 2016);
        setShortField(term61782, term61782.getClass(), "month", (short) 8);
        setShortField(term61782, term61782.getClass(), "day", (short) 9);
        setField(term61781, term61781.getClass(), "date", term61782);
        setByteField(term61786, term61786.getClass(), "hour", (byte) 11);
        setByteField(term61786, term61786.getClass(), "minute", (byte) 35);
        setByteField(term61786, term61786.getClass(), "second", (byte) 27);
        setIntField(term61786, term61786.getClass(), "nano", 440006638);
        setField(term61781, term61781.getClass(), "time", term61786);
        setField(term61755, term61755.getClass(), "accessTime", term61781);
        setField(term61753, term61753.getClass(), "card", term61755);
        setField(term61753, term61753.getClass(), "userName", "nOKVZSyfbZ");
        setIntField(term61804, term61804.getClass(), "year", 2017);
        setShortField(term61804, term61804.getClass(), "month", (short) 2);
        setShortField(term61804, term61804.getClass(), "day", (short) 24);
        setField(term61803, term61803.getClass(), "date", term61804);
        setByteField(term61808, term61808.getClass(), "hour", (byte) 23);
        setByteField(term61808, term61808.getClass(), "minute", (byte) 46);
        setByteField(term61808, term61808.getClass(), "second", (byte) 43);
        setIntField(term61808, term61808.getClass(), "nano", 626549570);
        setField(term61803, term61803.getClass(), "time", term61808);
        setField(term61753, term61753.getClass(), "lastLoginDate", term61803);
        setBooleanField(term61753, term61753.getClass(), "isWebJoin", true);
        setField(term61753, term61753.getClass(), "webLimitDate", "adHZFgDoEH");
        setIntField(term61753, term61753.getClass(), "level", 1439151010);
        setIntField(term61753, term61753.getClass(), "reincarnationNum", 520109121);
        setField(term61753, term61753.getClass(), "exp", "vjNETNMDhQ");
        setLongField(term61753, term61753.getClass(), "point", 3445409355788900348L);
        setLongField(term61753, term61753.getClass(), "totalPoint", -8079148366910851953L);
        setIntField(term61753, term61753.getClass(), "playCount", -1374704112);
        setIntField(term61753, term61753.getClass(), "multiPlayCount", 1603677150);
        setIntField(term61753, term61753.getClass(), "multiWinCount", -926340720);
        setIntField(term61753, term61753.getClass(), "requestResCount", -1134329349);
        setIntField(term61753, term61753.getClass(), "acceptResCount", -1590495256);
        setIntField(term61753, term61753.getClass(), "successResCount", 1804035317);
        setIntField(term61753, term61753.getClass(), "playerRating", -1627336108);
        setIntField(term61753, term61753.getClass(), "highestRating", -70819831);
        setIntField(term61753, term61753.getClass(), "nameplateId", 1601014438);
        setIntField(term61753, term61753.getClass(), "frameId", -1549492777);
        setIntField(term61753, term61753.getClass(), "characterId", -1166523434);
        setIntField(term61753, term61753.getClass(), "trophyId", -1459222679);
        setIntField(term61753, term61753.getClass(), "playedTutorialBit", 91387193);
        setIntField(term61753, term61753.getClass(), "firstTutorialCancelNum", -457093173);
        setIntField(term61753, term61753.getClass(), "masterTutorialCancelNum", -738503746);
        setIntField(term61753, term61753.getClass(), "totalRepertoireCount", 1118865267);
        setIntField(term61753, term61753.getClass(), "totalMapNum", 1899392740);
        setLongField(term61753, term61753.getClass(), "totalHiScore", 7775195107098215044L);
        setLongField(term61753, term61753.getClass(), "totalBasicHighScore", -1826927759081147983L);
        setLongField(term61753, term61753.getClass(), "totalAdvancedHighScore", 1770574028303523867L);
        setLongField(term61753, term61753.getClass(), "totalExpertHighScore", 6434856191210114702L);
        setLongField(term61753, term61753.getClass(), "totalMasterHighScore", 1306769240431962876L);
        setIntField(term61865, term61865.getClass(), "year", 2014);
        setShortField(term61865, term61865.getClass(), "month", (short) 4);
        setShortField(term61865, term61865.getClass(), "day", (short) 20);
        setField(term61864, term61864.getClass(), "date", term61865);
        setByteField(term61869, term61869.getClass(), "hour", (byte) 16);
        setByteField(term61869, term61869.getClass(), "minute", (byte) 19);
        setByteField(term61869, term61869.getClass(), "second", (byte) 50);
        setIntField(term61869, term61869.getClass(), "nano", 397343944);
        setField(term61864, term61864.getClass(), "time", term61869);
        setField(term61753, term61753.getClass(), "eventWatchedDate", term61864);
        setIntField(term61753, term61753.getClass(), "friendCount", 144291847);
        setBooleanField(term61753, term61753.getClass(), "isMaimai", true);
        setField(term61753, term61753.getClass(), "firstGameId", "pexqQqwSNj");
        setField(term61753, term61753.getClass(), "firstRomVersion", "myfXkIEBSV");
        setField(term61753, term61753.getClass(), "firstDataVersion", "LSrqDVjzEP");
        setIntField(term61913, term61913.getClass(), "year", 2010);
        setShortField(term61913, term61913.getClass(), "month", (short) 8);
        setShortField(term61913, term61913.getClass(), "day", (short) 25);
        setField(term61912, term61912.getClass(), "date", term61913);
        setByteField(term61917, term61917.getClass(), "hour", (byte) 7);
        setByteField(term61917, term61917.getClass(), "minute", (byte) 13);
        setByteField(term61917, term61917.getClass(), "second", (byte) 16);
        setIntField(term61917, term61917.getClass(), "nano", 196716483);
        setField(term61912, term61912.getClass(), "time", term61917);
        setField(term61753, term61753.getClass(), "firstPlayDate", term61912);
        setField(term61753, term61753.getClass(), "lastGameId", "CPZCLJxTuA");
        setField(term61753, term61753.getClass(), "lastRomVersion", "ivAOXnVjmg");
        setField(term61753, term61753.getClass(), "lastDataVersion", "FivesaUeHG");
        setIntField(term61959, term61959.getClass(), "year", 2016);
        setShortField(term61959, term61959.getClass(), "month", (short) 2);
        setShortField(term61959, term61959.getClass(), "day", (short) 19);
        setField(term61958, term61958.getClass(), "date", term61959);
        setByteField(term61963, term61963.getClass(), "hour", (byte) 1);
        setByteField(term61963, term61963.getClass(), "minute", (byte) 32);
        setByteField(term61963, term61963.getClass(), "second", (byte) 43);
        setIntField(term61963, term61963.getClass(), "nano", 671735228);
        setField(term61958, term61958.getClass(), "time", term61963);
        setField(term61753, term61753.getClass(), "lastPlayDate", term61958);
        setIntField(term61753, term61753.getClass(), "lastPlaceId", 263154490);
        setField(term61753, term61753.getClass(), "lastPlaceName", "TnpXhZmCRY");
        setField(term61753, term61753.getClass(), "lastRegionId", "ECVAXFhrTP");
        setField(term61753, term61753.getClass(), "lastRegionName", "ypytdNbrBc");
        setField(term61753, term61753.getClass(), "lastAllNetId", "XvrJCOSYei");
        setField(term61753, term61753.getClass(), "lastClientId", "QdRcxOxNSl");
        setField(term61751, term61751.getClass(), "user", term61753);
        setIntField(term61751, term61751.getClass(), "bgInfo", 1685033038);
        setIntField(term61751, term61751.getClass(), "fieldColor", 1455872685);
        setIntField(term61751, term61751.getClass(), "guideSound", -895803070);
        setIntField(term61751, term61751.getClass(), "soundEffect", -2065313027);
        setIntField(term61751, term61751.getClass(), "guideLine", 394881188);
        setIntField(term61751, term61751.getClass(), "speed", 2114133243);
        setIntField(term61751, term61751.getClass(), "optionSet", -1108430202);
        setIntField(term61751, term61751.getClass(), "matching", 972569482);
        setIntField(term61751, term61751.getClass(), "judgePos", -924513639);
        setIntField(term61751, term61751.getClass(), "rating", -1763498118);
        setIntField(term61751, term61751.getClass(), "judgeJustice", -1084106934);
        setIntField(term61751, term61751.getClass(), "judgeAttack", -1137769039);
        setIntField(term61751, term61751.getClass(), "headphone", 753769464);
        setIntField(term61751, term61751.getClass(), "playerLevel", -2025824446);
        setIntField(term61751, term61751.getClass(), "successTap", -203123521);
        setIntField(term61751, term61751.getClass(), "successExTap", 2107969370);
        setIntField(term61751, term61751.getClass(), "successSlideHold", -1606896209);
        setIntField(term61751, term61751.getClass(), "successAir", 1824801079);
        setIntField(term61751, term61751.getClass(), "successFlick", 1191665770);
        setIntField(term61751, term61751.getClass(), "successSkill", -401274751);
        setIntField(term61751, term61751.getClass(), "successTapTimbre", 2063937149);
        setIntField(term61751, term61751.getClass(), "privacy", 166881458);
        term62051 = new Integer(828853234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62051;
        callMethod(klass, "setFieldColor", argTypes, term61751, args);
    }

};


