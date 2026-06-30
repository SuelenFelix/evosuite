package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserEventMusic_setPlatinumScoreMax_167039286118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377631;
     Object term377915;

    public UserEventMusic_setPlatinumScoreMax_167039286118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term377637 = new Long(1592020674405941254L);
        term377631 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term377633 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term377635 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term377651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term377652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term377661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term377662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term377666 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term377631, term377631.getClass(), "id", 6374705618291094131L);
        setLongField(term377633, term377633.getClass(), "id", 3764446959049744926L);
        setLongField(term377635, term377635.getClass(), "id", 4043819239156448954L);
        setField(term377635, term377635.getClass(), "extId", term377637);
        setField(term377635, term377635.getClass(), "luid", "OVHAlNbvZq");
        setIntField(term377652, term377652.getClass(), "year", 2020);
        setShortField(term377652, term377652.getClass(), "month", (short) 3);
        setShortField(term377652, term377652.getClass(), "day", (short) 4);
        setField(term377651, term377651.getClass(), "date", term377652);
        setByteField(term377656, term377656.getClass(), "hour", (byte) 15);
        setByteField(term377656, term377656.getClass(), "minute", (byte) 59);
        setByteField(term377656, term377656.getClass(), "second", (byte) 28);
        setIntField(term377656, term377656.getClass(), "nano", 219640875);
        setField(term377651, term377651.getClass(), "time", term377656);
        setField(term377635, term377635.getClass(), "registerTime", term377651);
        setIntField(term377662, term377662.getClass(), "year", 2021);
        setShortField(term377662, term377662.getClass(), "month", (short) 8);
        setShortField(term377662, term377662.getClass(), "day", (short) 18);
        setField(term377661, term377661.getClass(), "date", term377662);
        setByteField(term377666, term377666.getClass(), "hour", (byte) 23);
        setByteField(term377666, term377666.getClass(), "minute", (byte) 3);
        setByteField(term377666, term377666.getClass(), "second", (byte) 56);
        setIntField(term377666, term377666.getClass(), "nano", 215420067);
        setField(term377661, term377661.getClass(), "time", term377666);
        setField(term377635, term377635.getClass(), "accessTime", term377661);
        setField(term377633, term377633.getClass(), "card", term377635);
        setField(term377633, term377633.getClass(), "userName", "quhRwmhhYW");
        setIntField(term377633, term377633.getClass(), "level", -1019417321);
        setIntField(term377633, term377633.getClass(), "reincarnationNum", 1076301679);
        setLongField(term377633, term377633.getClass(), "exp", 7281524687432344573L);
        setLongField(term377633, term377633.getClass(), "point", -2048981340436075387L);
        setLongField(term377633, term377633.getClass(), "totalPoint", 4710434847941045811L);
        setIntField(term377633, term377633.getClass(), "playCount", 1132298382);
        setIntField(term377633, term377633.getClass(), "jewelCount", -1307608280);
        setIntField(term377633, term377633.getClass(), "totalJewelCount", -1161031540);
        setIntField(term377633, term377633.getClass(), "medalCount", 111906379);
        setIntField(term377633, term377633.getClass(), "playerRating", -1823672225);
        setIntField(term377633, term377633.getClass(), "highestRating", 1168315058);
        setIntField(term377633, term377633.getClass(), "battlePoint", 878306332);
        setIntField(term377633, term377633.getClass(), "bestBattlePoint", -825111405);
        setIntField(term377633, term377633.getClass(), "overDamageBattlePoint", 1474163044);
        setBooleanField(term377633, term377633.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term377633, term377633.getClass(), "nameplateId", -2121122733);
        setIntField(term377633, term377633.getClass(), "trophyId", 571653804);
        setIntField(term377633, term377633.getClass(), "cardId", -164270853);
        setIntField(term377633, term377633.getClass(), "characterId", -1305444081);
        setIntField(term377633, term377633.getClass(), "characterVoiceNo", -556582214);
        setIntField(term377633, term377633.getClass(), "tabSetting", 1710050300);
        setIntField(term377633, term377633.getClass(), "tabSortSetting", 1467232017);
        setIntField(term377633, term377633.getClass(), "cardCategorySetting", -3531973);
        setIntField(term377633, term377633.getClass(), "cardSortSetting", 2016586909);
        setIntField(term377633, term377633.getClass(), "rivalScoreCategorySetting", 607926043);
        setIntField(term377633, term377633.getClass(), "playedTutorialBit", 206027425);
        setIntField(term377633, term377633.getClass(), "firstTutorialCancelNum", -459471927);
        setLongField(term377633, term377633.getClass(), "sumTechHighScore", 287908393241691930L);
        setLongField(term377633, term377633.getClass(), "sumTechBasicHighScore", -4998448517330680191L);
        setLongField(term377633, term377633.getClass(), "sumTechAdvancedHighScore", -8371830818613284971L);
        setLongField(term377633, term377633.getClass(), "sumTechExpertHighScore", -4138275510809497684L);
        setLongField(term377633, term377633.getClass(), "sumTechMasterHighScore", 5088710689357019220L);
        setLongField(term377633, term377633.getClass(), "sumTechLunaticHighScore", -7176152741995262591L);
        setLongField(term377633, term377633.getClass(), "sumBattleHighScore", -7634071308953447788L);
        setLongField(term377633, term377633.getClass(), "sumBattleBasicHighScore", -6015048974346091240L);
        setLongField(term377633, term377633.getClass(), "sumBattleAdvancedHighScore", 1418988601927660124L);
        setLongField(term377633, term377633.getClass(), "sumBattleExpertHighScore", -1110888870465561252L);
        setLongField(term377633, term377633.getClass(), "sumBattleMasterHighScore", 3202186345966947481L);
        setLongField(term377633, term377633.getClass(), "sumBattleLunaticHighScore", -7498565774764350518L);
        setField(term377633, term377633.getClass(), "eventWatchedDate", "pztGDyCNQH");
        setField(term377633, term377633.getClass(), "cmEventWatchedDate", "cczxfAhqmU");
        setField(term377633, term377633.getClass(), "firstGameId", "cmNHHaHUYK");
        setField(term377633, term377633.getClass(), "firstRomVersion", "hzHQfpbLcl");
        setField(term377633, term377633.getClass(), "firstDataVersion", "KPElkkesFj");
        setField(term377633, term377633.getClass(), "firstPlayDate", "YFFKtKebRY");
        setField(term377633, term377633.getClass(), "lastGameId", "WXoOqJkiqS");
        setField(term377633, term377633.getClass(), "lastRomVersion", "JDCeZOXhhY");
        setField(term377633, term377633.getClass(), "lastDataVersion", "kjHLsJoJFE");
        setField(term377633, term377633.getClass(), "compatibleCmVersion", "GSiNDImUye");
        setField(term377633, term377633.getClass(), "lastPlayDate", "dngdBbuWyx");
        setIntField(term377633, term377633.getClass(), "lastPlaceId", 1046077624);
        setField(term377633, term377633.getClass(), "lastPlaceName", "mrOecaZhoa");
        setIntField(term377633, term377633.getClass(), "lastRegionId", -2054453219);
        setField(term377633, term377633.getClass(), "lastRegionName", "UmpppgQjQB");
        setIntField(term377633, term377633.getClass(), "lastAllNetId", 1424375130);
        setField(term377633, term377633.getClass(), "lastClientId", "DIxqRZWKQl");
        setIntField(term377633, term377633.getClass(), "lastUsedDeckId", 670877035);
        setIntField(term377633, term377633.getClass(), "lastPlayMusicLevel", 303556117);
        setIntField(term377633, term377633.getClass(), "lastEmoneyBrand", -2096518900);
        setField(term377631, term377631.getClass(), "user", term377633);
        setIntField(term377631, term377631.getClass(), "eventId", 605863601);
        setIntField(term377631, term377631.getClass(), "type", 291684799);
        setIntField(term377631, term377631.getClass(), "musicId", 133487758);
        setIntField(term377631, term377631.getClass(), "level", -1203288548);
        setIntField(term377631, term377631.getClass(), "techScoreMax", -1721741820);
        setIntField(term377631, term377631.getClass(), "platinumScoreMax", -1838993761);
        setField(term377631, term377631.getClass(), "techRecordDate", "OsTXsMGxTA");
        setBooleanField(term377631, term377631.getClass(), "isTechNewRecord", true);
        term377915 = new Integer(-1031059056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term377915;
        callMethod(klass, "setPlatinumScoreMax", argTypes, term377631, args);
    }

};


