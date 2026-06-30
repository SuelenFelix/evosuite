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

public class UserCharacter_setCharacterId_7819930414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114580;
     Object term114867;

    public UserCharacter_setCharacterId_7819930414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114586 = new Long(5904678961906211249L);
        term114580 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term114582 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term114584 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term114600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114610 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114611 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114615 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114637 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114792 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term114580, term114580.getClass(), "id", 6410411768623434810L);
        setLongField(term114582, term114582.getClass(), "id", 531588883096789016L);
        setLongField(term114584, term114584.getClass(), "id", 6836437118639426505L);
        setField(term114584, term114584.getClass(), "extId", term114586);
        setField(term114584, term114584.getClass(), "luid", "tUeeoALgnV");
        setIntField(term114601, term114601.getClass(), "year", 2010);
        setShortField(term114601, term114601.getClass(), "month", (short) 7);
        setShortField(term114601, term114601.getClass(), "day", (short) 28);
        setField(term114600, term114600.getClass(), "date", term114601);
        setByteField(term114605, term114605.getClass(), "hour", (byte) 3);
        setByteField(term114605, term114605.getClass(), "minute", (byte) 56);
        setByteField(term114605, term114605.getClass(), "second", (byte) 12);
        setIntField(term114605, term114605.getClass(), "nano", 875469418);
        setField(term114600, term114600.getClass(), "time", term114605);
        setField(term114584, term114584.getClass(), "registerTime", term114600);
        setIntField(term114611, term114611.getClass(), "year", 2018);
        setShortField(term114611, term114611.getClass(), "month", (short) 9);
        setShortField(term114611, term114611.getClass(), "day", (short) 17);
        setField(term114610, term114610.getClass(), "date", term114611);
        setByteField(term114615, term114615.getClass(), "hour", (byte) 10);
        setByteField(term114615, term114615.getClass(), "minute", (byte) 3);
        setByteField(term114615, term114615.getClass(), "second", (byte) 22);
        setIntField(term114615, term114615.getClass(), "nano", 633488486);
        setField(term114610, term114610.getClass(), "time", term114615);
        setField(term114584, term114584.getClass(), "accessTime", term114610);
        setField(term114582, term114582.getClass(), "card", term114584);
        setField(term114582, term114582.getClass(), "userName", "RKrTOHCtIL");
        setIntField(term114633, term114633.getClass(), "year", 2028);
        setShortField(term114633, term114633.getClass(), "month", (short) 6);
        setShortField(term114633, term114633.getClass(), "day", (short) 8);
        setField(term114632, term114632.getClass(), "date", term114633);
        setByteField(term114637, term114637.getClass(), "hour", (byte) 4);
        setByteField(term114637, term114637.getClass(), "minute", (byte) 13);
        setByteField(term114637, term114637.getClass(), "second", (byte) 21);
        setIntField(term114637, term114637.getClass(), "nano", 207650672);
        setField(term114632, term114632.getClass(), "time", term114637);
        setField(term114582, term114582.getClass(), "lastLoginDate", term114632);
        setBooleanField(term114582, term114582.getClass(), "isWebJoin", false);
        setField(term114582, term114582.getClass(), "webLimitDate", "weKhJGqEfg");
        setIntField(term114582, term114582.getClass(), "level", 694510512);
        setIntField(term114582, term114582.getClass(), "reincarnationNum", 1668115404);
        setField(term114582, term114582.getClass(), "exp", "TLUMeWJCRR");
        setLongField(term114582, term114582.getClass(), "point", -4331507977193439740L);
        setLongField(term114582, term114582.getClass(), "totalPoint", -9195513111314648691L);
        setIntField(term114582, term114582.getClass(), "playCount", -1244092546);
        setIntField(term114582, term114582.getClass(), "multiPlayCount", -939472836);
        setIntField(term114582, term114582.getClass(), "multiWinCount", 924950442);
        setIntField(term114582, term114582.getClass(), "requestResCount", 154444104);
        setIntField(term114582, term114582.getClass(), "acceptResCount", 1812340862);
        setIntField(term114582, term114582.getClass(), "successResCount", 1048628494);
        setIntField(term114582, term114582.getClass(), "playerRating", -1259863856);
        setIntField(term114582, term114582.getClass(), "highestRating", 259620797);
        setIntField(term114582, term114582.getClass(), "nameplateId", 592523230);
        setIntField(term114582, term114582.getClass(), "frameId", 729128701);
        setIntField(term114582, term114582.getClass(), "characterId", -1990251566);
        setIntField(term114582, term114582.getClass(), "trophyId", 234165066);
        setIntField(term114582, term114582.getClass(), "playedTutorialBit", 1223931792);
        setIntField(term114582, term114582.getClass(), "firstTutorialCancelNum", 1032967382);
        setIntField(term114582, term114582.getClass(), "masterTutorialCancelNum", 832942795);
        setIntField(term114582, term114582.getClass(), "totalRepertoireCount", 1812644002);
        setIntField(term114582, term114582.getClass(), "totalMapNum", -701090454);
        setLongField(term114582, term114582.getClass(), "totalHiScore", -2836676267610333091L);
        setLongField(term114582, term114582.getClass(), "totalBasicHighScore", 3399508076702974138L);
        setLongField(term114582, term114582.getClass(), "totalAdvancedHighScore", 2488466015930515496L);
        setLongField(term114582, term114582.getClass(), "totalExpertHighScore", -937505178592782760L);
        setLongField(term114582, term114582.getClass(), "totalMasterHighScore", 1129741221881232004L);
        setIntField(term114694, term114694.getClass(), "year", 2027);
        setShortField(term114694, term114694.getClass(), "month", (short) 7);
        setShortField(term114694, term114694.getClass(), "day", (short) 11);
        setField(term114693, term114693.getClass(), "date", term114694);
        setByteField(term114698, term114698.getClass(), "hour", (byte) 21);
        setByteField(term114698, term114698.getClass(), "minute", (byte) 3);
        setByteField(term114698, term114698.getClass(), "second", (byte) 15);
        setIntField(term114698, term114698.getClass(), "nano", 117842790);
        setField(term114693, term114693.getClass(), "time", term114698);
        setField(term114582, term114582.getClass(), "eventWatchedDate", term114693);
        setIntField(term114582, term114582.getClass(), "friendCount", -1986771984);
        setBooleanField(term114582, term114582.getClass(), "isMaimai", true);
        setField(term114582, term114582.getClass(), "firstGameId", "TuVnFrfwDO");
        setField(term114582, term114582.getClass(), "firstRomVersion", "HLaksjKQLu");
        setField(term114582, term114582.getClass(), "firstDataVersion", "tUmAYoRjRt");
        setIntField(term114742, term114742.getClass(), "year", 2017);
        setShortField(term114742, term114742.getClass(), "month", (short) 3);
        setShortField(term114742, term114742.getClass(), "day", (short) 28);
        setField(term114741, term114741.getClass(), "date", term114742);
        setByteField(term114746, term114746.getClass(), "hour", (byte) 3);
        setByteField(term114746, term114746.getClass(), "minute", (byte) 48);
        setByteField(term114746, term114746.getClass(), "second", (byte) 56);
        setIntField(term114746, term114746.getClass(), "nano", 744640984);
        setField(term114741, term114741.getClass(), "time", term114746);
        setField(term114582, term114582.getClass(), "firstPlayDate", term114741);
        setField(term114582, term114582.getClass(), "lastGameId", "BAADpSzVyH");
        setField(term114582, term114582.getClass(), "lastRomVersion", "PWiSQlucVO");
        setField(term114582, term114582.getClass(), "lastDataVersion", "SkAkmjxoiu");
        setIntField(term114788, term114788.getClass(), "year", 2010);
        setShortField(term114788, term114788.getClass(), "month", (short) 10);
        setShortField(term114788, term114788.getClass(), "day", (short) 9);
        setField(term114787, term114787.getClass(), "date", term114788);
        setByteField(term114792, term114792.getClass(), "hour", (byte) 19);
        setByteField(term114792, term114792.getClass(), "minute", (byte) 0);
        setByteField(term114792, term114792.getClass(), "second", (byte) 53);
        setIntField(term114792, term114792.getClass(), "nano", 515378725);
        setField(term114787, term114787.getClass(), "time", term114792);
        setField(term114582, term114582.getClass(), "lastPlayDate", term114787);
        setIntField(term114582, term114582.getClass(), "lastPlaceId", -1975052346);
        setField(term114582, term114582.getClass(), "lastPlaceName", "nQyRXiYkyU");
        setField(term114582, term114582.getClass(), "lastRegionId", "kpNIadQEnq");
        setField(term114582, term114582.getClass(), "lastRegionName", "sLWXiUGWKR");
        setField(term114582, term114582.getClass(), "lastAllNetId", "aSBloErOPY");
        setField(term114582, term114582.getClass(), "lastClientId", "ItfmeAXEYy");
        setField(term114580, term114580.getClass(), "user", term114582);
        setIntField(term114580, term114580.getClass(), "characterId", -619909309);
        setIntField(term114580, term114580.getClass(), "playCount", 277279565);
        setIntField(term114580, term114580.getClass(), "level", 1);
        setIntField(term114580, term114580.getClass(), "skillId", -1030236289);
        setIntField(term114580, term114580.getClass(), "friendshipExp", -568331388);
        setBooleanField(term114580, term114580.getClass(), "isValid", true);
        setBooleanField(term114580, term114580.getClass(), "isNewMark", true);
        setIntField(term114580, term114580.getClass(), "param1", 1558553325);
        setIntField(term114580, term114580.getClass(), "param2", -401500792);
        term114867 = new Integer(-1497822933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term114867;
        callMethod(klass, "setCharacterId", argTypes, term114580, args);
    }

};


