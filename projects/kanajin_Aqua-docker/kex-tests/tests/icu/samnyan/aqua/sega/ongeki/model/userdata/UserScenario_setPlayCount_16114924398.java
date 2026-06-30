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

public class UserScenario_setPlayCount_16114924398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99960;
     Object term100227;

    public UserScenario_setPlayCount_16114924398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99966 = new Long(-1145146470850585022L);
        term99960 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario"));
        Object term99962 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term99964 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99985 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99995 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99960, term99960.getClass(), "id", 8745188247028469647L);
        setLongField(term99962, term99962.getClass(), "id", -1981865007955337201L);
        setLongField(term99964, term99964.getClass(), "id", 3725162199751207272L);
        setField(term99964, term99964.getClass(), "extId", term99966);
        setField(term99964, term99964.getClass(), "luid", "ABkOTQedzY");
        setIntField(term99981, term99981.getClass(), "year", 2027);
        setShortField(term99981, term99981.getClass(), "month", (short) 12);
        setShortField(term99981, term99981.getClass(), "day", (short) 25);
        setField(term99980, term99980.getClass(), "date", term99981);
        setByteField(term99985, term99985.getClass(), "hour", (byte) 7);
        setByteField(term99985, term99985.getClass(), "minute", (byte) 38);
        setByteField(term99985, term99985.getClass(), "second", (byte) 45);
        setIntField(term99985, term99985.getClass(), "nano", 660882666);
        setField(term99980, term99980.getClass(), "time", term99985);
        setField(term99964, term99964.getClass(), "registerTime", term99980);
        setIntField(term99991, term99991.getClass(), "year", 2025);
        setShortField(term99991, term99991.getClass(), "month", (short) 9);
        setShortField(term99991, term99991.getClass(), "day", (short) 21);
        setField(term99990, term99990.getClass(), "date", term99991);
        setByteField(term99995, term99995.getClass(), "hour", (byte) 16);
        setByteField(term99995, term99995.getClass(), "minute", (byte) 28);
        setByteField(term99995, term99995.getClass(), "second", (byte) 17);
        setIntField(term99995, term99995.getClass(), "nano", 64339643);
        setField(term99990, term99990.getClass(), "time", term99995);
        setField(term99964, term99964.getClass(), "accessTime", term99990);
        setField(term99962, term99962.getClass(), "card", term99964);
        setField(term99962, term99962.getClass(), "userName", "EFsPqsIRQv");
        setIntField(term99962, term99962.getClass(), "level", -2030563792);
        setIntField(term99962, term99962.getClass(), "reincarnationNum", 659265799);
        setLongField(term99962, term99962.getClass(), "exp", 2177661519078714019L);
        setLongField(term99962, term99962.getClass(), "point", -7627890620954511666L);
        setLongField(term99962, term99962.getClass(), "totalPoint", 6226564475251569033L);
        setIntField(term99962, term99962.getClass(), "playCount", -2000221306);
        setIntField(term99962, term99962.getClass(), "jewelCount", -1480264652);
        setIntField(term99962, term99962.getClass(), "totalJewelCount", 950199901);
        setIntField(term99962, term99962.getClass(), "medalCount", -566918920);
        setIntField(term99962, term99962.getClass(), "playerRating", -516485250);
        setIntField(term99962, term99962.getClass(), "highestRating", -1315484955);
        setIntField(term99962, term99962.getClass(), "battlePoint", 1864285170);
        setIntField(term99962, term99962.getClass(), "bestBattlePoint", -1621410076);
        setIntField(term99962, term99962.getClass(), "overDamageBattlePoint", -239419301);
        setBooleanField(term99962, term99962.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term99962, term99962.getClass(), "nameplateId", 1572833583);
        setIntField(term99962, term99962.getClass(), "trophyId", -404366819);
        setIntField(term99962, term99962.getClass(), "cardId", 417600776);
        setIntField(term99962, term99962.getClass(), "characterId", -821143832);
        setIntField(term99962, term99962.getClass(), "characterVoiceNo", -1416902664);
        setIntField(term99962, term99962.getClass(), "tabSetting", -1435299233);
        setIntField(term99962, term99962.getClass(), "tabSortSetting", -1100306206);
        setIntField(term99962, term99962.getClass(), "cardCategorySetting", 68958966);
        setIntField(term99962, term99962.getClass(), "cardSortSetting", 349586221);
        setIntField(term99962, term99962.getClass(), "rivalScoreCategorySetting", -2038396357);
        setIntField(term99962, term99962.getClass(), "playedTutorialBit", -1334161201);
        setIntField(term99962, term99962.getClass(), "firstTutorialCancelNum", -2125960665);
        setLongField(term99962, term99962.getClass(), "sumTechHighScore", -4159863432036511837L);
        setLongField(term99962, term99962.getClass(), "sumTechBasicHighScore", 7397608429844042575L);
        setLongField(term99962, term99962.getClass(), "sumTechAdvancedHighScore", 298756682777431426L);
        setLongField(term99962, term99962.getClass(), "sumTechExpertHighScore", 1074990585989802601L);
        setLongField(term99962, term99962.getClass(), "sumTechMasterHighScore", 9066576144978232615L);
        setLongField(term99962, term99962.getClass(), "sumTechLunaticHighScore", 8152379894028795698L);
        setLongField(term99962, term99962.getClass(), "sumBattleHighScore", -6852826463016078835L);
        setLongField(term99962, term99962.getClass(), "sumBattleBasicHighScore", -1105029726312622544L);
        setLongField(term99962, term99962.getClass(), "sumBattleAdvancedHighScore", 6124417557876373592L);
        setLongField(term99962, term99962.getClass(), "sumBattleExpertHighScore", -3951408454367699300L);
        setLongField(term99962, term99962.getClass(), "sumBattleMasterHighScore", 9080921777701921013L);
        setLongField(term99962, term99962.getClass(), "sumBattleLunaticHighScore", -1374439556714560224L);
        setField(term99962, term99962.getClass(), "eventWatchedDate", "SLJrzKBPdq");
        setField(term99962, term99962.getClass(), "cmEventWatchedDate", "TanVvFPLln");
        setField(term99962, term99962.getClass(), "firstGameId", "IDakEXhNfN");
        setField(term99962, term99962.getClass(), "firstRomVersion", "zuVCIcZmHu");
        setField(term99962, term99962.getClass(), "firstDataVersion", "TOgWyfMILX");
        setField(term99962, term99962.getClass(), "firstPlayDate", "FqpUNAOtmF");
        setField(term99962, term99962.getClass(), "lastGameId", "SpILHdKTKK");
        setField(term99962, term99962.getClass(), "lastRomVersion", "LklQRqbChE");
        setField(term99962, term99962.getClass(), "lastDataVersion", "wxbPKcvjhX");
        setField(term99962, term99962.getClass(), "compatibleCmVersion", "RmyltMpQEu");
        setField(term99962, term99962.getClass(), "lastPlayDate", "ozlDkmzKuq");
        setIntField(term99962, term99962.getClass(), "lastPlaceId", -755852794);
        setField(term99962, term99962.getClass(), "lastPlaceName", "oGDeaReDRG");
        setIntField(term99962, term99962.getClass(), "lastRegionId", -881250262);
        setField(term99962, term99962.getClass(), "lastRegionName", "DjDquUkDJf");
        setIntField(term99962, term99962.getClass(), "lastAllNetId", 803280886);
        setField(term99962, term99962.getClass(), "lastClientId", "SszlMxumKX");
        setIntField(term99962, term99962.getClass(), "lastUsedDeckId", -1274349559);
        setIntField(term99962, term99962.getClass(), "lastPlayMusicLevel", 620253070);
        setIntField(term99962, term99962.getClass(), "lastEmoneyBrand", 391646161);
        setField(term99960, term99960.getClass(), "user", term99962);
        setIntField(term99960, term99960.getClass(), "scenarioId", 1556323428);
        setIntField(term99960, term99960.getClass(), "playCount", -1121322138);
        term100227 = new Integer(320229218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100227;
        callMethod(klass, "setPlayCount", argTypes, term99960, args);
    }

};


