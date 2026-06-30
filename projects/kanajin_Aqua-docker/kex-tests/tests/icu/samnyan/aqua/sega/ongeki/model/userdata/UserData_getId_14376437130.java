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

public class UserData_getId_14376437130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21918;

    public UserData_getId_14376437130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21922 = new Long(-3842548265506930260L);
        term21918 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term21920 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term21936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21951 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term21918, term21918.getClass(), "id", -4773031420684190217L);
        setLongField(term21920, term21920.getClass(), "id", 4815723481405472054L);
        setField(term21920, term21920.getClass(), "extId", term21922);
        setField(term21920, term21920.getClass(), "luid", "kwteHWzwcc");
        setIntField(term21937, term21937.getClass(), "year", 2019);
        setShortField(term21937, term21937.getClass(), "month", (short) 8);
        setShortField(term21937, term21937.getClass(), "day", (short) 12);
        setField(term21936, term21936.getClass(), "date", term21937);
        setByteField(term21941, term21941.getClass(), "hour", (byte) 14);
        setByteField(term21941, term21941.getClass(), "minute", (byte) 1);
        setByteField(term21941, term21941.getClass(), "second", (byte) 51);
        setIntField(term21941, term21941.getClass(), "nano", 499021786);
        setField(term21936, term21936.getClass(), "time", term21941);
        setField(term21920, term21920.getClass(), "registerTime", term21936);
        setIntField(term21947, term21947.getClass(), "year", 2014);
        setShortField(term21947, term21947.getClass(), "month", (short) 7);
        setShortField(term21947, term21947.getClass(), "day", (short) 22);
        setField(term21946, term21946.getClass(), "date", term21947);
        setByteField(term21951, term21951.getClass(), "hour", (byte) 9);
        setByteField(term21951, term21951.getClass(), "minute", (byte) 40);
        setByteField(term21951, term21951.getClass(), "second", (byte) 34);
        setIntField(term21951, term21951.getClass(), "nano", 463008257);
        setField(term21946, term21946.getClass(), "time", term21951);
        setField(term21920, term21920.getClass(), "accessTime", term21946);
        setField(term21918, term21918.getClass(), "card", term21920);
        setField(term21918, term21918.getClass(), "userName", "uMsWXqNhln");
        setIntField(term21918, term21918.getClass(), "level", -574611924);
        setIntField(term21918, term21918.getClass(), "reincarnationNum", 512521742);
        setLongField(term21918, term21918.getClass(), "exp", 8621736372873134417L);
        setLongField(term21918, term21918.getClass(), "point", 5106927272042726665L);
        setLongField(term21918, term21918.getClass(), "totalPoint", 6913945762720683253L);
        setIntField(term21918, term21918.getClass(), "playCount", 1291000976);
        setIntField(term21918, term21918.getClass(), "jewelCount", 1143522832);
        setIntField(term21918, term21918.getClass(), "totalJewelCount", 40965975);
        setIntField(term21918, term21918.getClass(), "medalCount", -194718582);
        setIntField(term21918, term21918.getClass(), "playerRating", 42982854);
        setIntField(term21918, term21918.getClass(), "highestRating", -1129506480);
        setIntField(term21918, term21918.getClass(), "battlePoint", 301438568);
        setIntField(term21918, term21918.getClass(), "bestBattlePoint", -1667908453);
        setIntField(term21918, term21918.getClass(), "overDamageBattlePoint", 315910438);
        setBooleanField(term21918, term21918.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term21918, term21918.getClass(), "nameplateId", -1673157821);
        setIntField(term21918, term21918.getClass(), "trophyId", 1217804703);
        setIntField(term21918, term21918.getClass(), "cardId", -1981494102);
        setIntField(term21918, term21918.getClass(), "characterId", -2064148945);
        setIntField(term21918, term21918.getClass(), "characterVoiceNo", 494400151);
        setIntField(term21918, term21918.getClass(), "tabSetting", 1588058685);
        setIntField(term21918, term21918.getClass(), "tabSortSetting", 1677707412);
        setIntField(term21918, term21918.getClass(), "cardCategorySetting", -297367861);
        setIntField(term21918, term21918.getClass(), "cardSortSetting", -1133541490);
        setIntField(term21918, term21918.getClass(), "rivalScoreCategorySetting", 942412391);
        setIntField(term21918, term21918.getClass(), "playedTutorialBit", 751596480);
        setIntField(term21918, term21918.getClass(), "firstTutorialCancelNum", 1971485144);
        setLongField(term21918, term21918.getClass(), "sumTechHighScore", -7873197993099724563L);
        setLongField(term21918, term21918.getClass(), "sumTechBasicHighScore", -4539648422466320845L);
        setLongField(term21918, term21918.getClass(), "sumTechAdvancedHighScore", 369988508829037253L);
        setLongField(term21918, term21918.getClass(), "sumTechExpertHighScore", -9069994265835848577L);
        setLongField(term21918, term21918.getClass(), "sumTechMasterHighScore", -1698215709085558019L);
        setLongField(term21918, term21918.getClass(), "sumTechLunaticHighScore", -9057998854977924783L);
        setLongField(term21918, term21918.getClass(), "sumBattleHighScore", 8015201292704898322L);
        setLongField(term21918, term21918.getClass(), "sumBattleBasicHighScore", 623115373634781772L);
        setLongField(term21918, term21918.getClass(), "sumBattleAdvancedHighScore", -6928102703492980650L);
        setLongField(term21918, term21918.getClass(), "sumBattleExpertHighScore", -5269076898456067678L);
        setLongField(term21918, term21918.getClass(), "sumBattleMasterHighScore", 2124275424075254005L);
        setLongField(term21918, term21918.getClass(), "sumBattleLunaticHighScore", -6616339196088014666L);
        setField(term21918, term21918.getClass(), "eventWatchedDate", "MAnhIPOtHL");
        setField(term21918, term21918.getClass(), "cmEventWatchedDate", "dikKjYjmRO");
        setField(term21918, term21918.getClass(), "firstGameId", "GJnnMDVnEP");
        setField(term21918, term21918.getClass(), "firstRomVersion", "zSMVllDpfk");
        setField(term21918, term21918.getClass(), "firstDataVersion", "iptRXVDoYE");
        setField(term21918, term21918.getClass(), "firstPlayDate", "kucsxnvbES");
        setField(term21918, term21918.getClass(), "lastGameId", "IdGzDFfcZf");
        setField(term21918, term21918.getClass(), "lastRomVersion", "KDdRNhZmnU");
        setField(term21918, term21918.getClass(), "lastDataVersion", "iMsqJaKlDC");
        setField(term21918, term21918.getClass(), "compatibleCmVersion", "aPkGHbZyjj");
        setField(term21918, term21918.getClass(), "lastPlayDate", "nSWdsVyJRI");
        setIntField(term21918, term21918.getClass(), "lastPlaceId", 2059603512);
        setField(term21918, term21918.getClass(), "lastPlaceName", "JBOPGgGKnc");
        setIntField(term21918, term21918.getClass(), "lastRegionId", -1308902065);
        setField(term21918, term21918.getClass(), "lastRegionName", "GlPTiCMCGP");
        setIntField(term21918, term21918.getClass(), "lastAllNetId", 605255795);
        setField(term21918, term21918.getClass(), "lastClientId", "jlcBpLoWfd");
        setIntField(term21918, term21918.getClass(), "lastUsedDeckId", 1743438307);
        setIntField(term21918, term21918.getClass(), "lastPlayMusicLevel", -1122596893);
        setIntField(term21918, term21918.getClass(), "lastEmoneyBrand", -2147297900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term21918, args);
    }

};


