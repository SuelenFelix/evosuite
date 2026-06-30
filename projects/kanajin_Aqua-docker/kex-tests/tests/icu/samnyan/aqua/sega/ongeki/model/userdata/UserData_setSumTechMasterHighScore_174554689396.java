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

public class UserData_setSumTechMasterHighScore_174554689396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62658;
     Object term62921;

    public UserData_setSumTechMasterHighScore_174554689396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62662 = new Long(8166095254618543564L);
        term62658 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term62660 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term62676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62681 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62691 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62658, term62658.getClass(), "id", 4787080389628135236L);
        setLongField(term62660, term62660.getClass(), "id", -8904293163264570294L);
        setField(term62660, term62660.getClass(), "extId", term62662);
        setField(term62660, term62660.getClass(), "luid", "HHAcgDPghN");
        setIntField(term62677, term62677.getClass(), "year", 2010);
        setShortField(term62677, term62677.getClass(), "month", (short) 3);
        setShortField(term62677, term62677.getClass(), "day", (short) 22);
        setField(term62676, term62676.getClass(), "date", term62677);
        setByteField(term62681, term62681.getClass(), "hour", (byte) 23);
        setByteField(term62681, term62681.getClass(), "minute", (byte) 36);
        setByteField(term62681, term62681.getClass(), "second", (byte) 22);
        setIntField(term62681, term62681.getClass(), "nano", 781575122);
        setField(term62676, term62676.getClass(), "time", term62681);
        setField(term62660, term62660.getClass(), "registerTime", term62676);
        setIntField(term62687, term62687.getClass(), "year", 2015);
        setShortField(term62687, term62687.getClass(), "month", (short) 8);
        setShortField(term62687, term62687.getClass(), "day", (short) 6);
        setField(term62686, term62686.getClass(), "date", term62687);
        setByteField(term62691, term62691.getClass(), "hour", (byte) 16);
        setByteField(term62691, term62691.getClass(), "minute", (byte) 16);
        setByteField(term62691, term62691.getClass(), "second", (byte) 21);
        setIntField(term62691, term62691.getClass(), "nano", 274900303);
        setField(term62686, term62686.getClass(), "time", term62691);
        setField(term62660, term62660.getClass(), "accessTime", term62686);
        setField(term62658, term62658.getClass(), "card", term62660);
        setField(term62658, term62658.getClass(), "userName", "GzmFcFoYft");
        setIntField(term62658, term62658.getClass(), "level", 1233013986);
        setIntField(term62658, term62658.getClass(), "reincarnationNum", 342111166);
        setLongField(term62658, term62658.getClass(), "exp", -9146144965408025864L);
        setLongField(term62658, term62658.getClass(), "point", -2955701716630821049L);
        setLongField(term62658, term62658.getClass(), "totalPoint", 8810510947864468259L);
        setIntField(term62658, term62658.getClass(), "playCount", -846825115);
        setIntField(term62658, term62658.getClass(), "jewelCount", -88572295);
        setIntField(term62658, term62658.getClass(), "totalJewelCount", -1830705318);
        setIntField(term62658, term62658.getClass(), "medalCount", 1003880925);
        setIntField(term62658, term62658.getClass(), "playerRating", -1963566761);
        setIntField(term62658, term62658.getClass(), "highestRating", -1043400736);
        setIntField(term62658, term62658.getClass(), "battlePoint", 497106793);
        setIntField(term62658, term62658.getClass(), "bestBattlePoint", -1904196296);
        setIntField(term62658, term62658.getClass(), "overDamageBattlePoint", -1857445668);
        setBooleanField(term62658, term62658.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term62658, term62658.getClass(), "nameplateId", -1481132293);
        setIntField(term62658, term62658.getClass(), "trophyId", -1458633954);
        setIntField(term62658, term62658.getClass(), "cardId", 1334294885);
        setIntField(term62658, term62658.getClass(), "characterId", -711784035);
        setIntField(term62658, term62658.getClass(), "characterVoiceNo", -497219797);
        setIntField(term62658, term62658.getClass(), "tabSetting", 720453125);
        setIntField(term62658, term62658.getClass(), "tabSortSetting", -860314891);
        setIntField(term62658, term62658.getClass(), "cardCategorySetting", -444697262);
        setIntField(term62658, term62658.getClass(), "cardSortSetting", -460183304);
        setIntField(term62658, term62658.getClass(), "rivalScoreCategorySetting", -2123879019);
        setIntField(term62658, term62658.getClass(), "playedTutorialBit", -745063212);
        setIntField(term62658, term62658.getClass(), "firstTutorialCancelNum", 298277204);
        setLongField(term62658, term62658.getClass(), "sumTechHighScore", 2653516526280557602L);
        setLongField(term62658, term62658.getClass(), "sumTechBasicHighScore", 562794068928395674L);
        setLongField(term62658, term62658.getClass(), "sumTechAdvancedHighScore", -2826036159687567411L);
        setLongField(term62658, term62658.getClass(), "sumTechExpertHighScore", -4457208393673096945L);
        setLongField(term62658, term62658.getClass(), "sumTechMasterHighScore", 6449000223758009356L);
        setLongField(term62658, term62658.getClass(), "sumTechLunaticHighScore", -6691521986846521707L);
        setLongField(term62658, term62658.getClass(), "sumBattleHighScore", 3084789868117337760L);
        setLongField(term62658, term62658.getClass(), "sumBattleBasicHighScore", -3515538619235139741L);
        setLongField(term62658, term62658.getClass(), "sumBattleAdvancedHighScore", -3470805235558058328L);
        setLongField(term62658, term62658.getClass(), "sumBattleExpertHighScore", -9073316743711770921L);
        setLongField(term62658, term62658.getClass(), "sumBattleMasterHighScore", -7516961291260914620L);
        setLongField(term62658, term62658.getClass(), "sumBattleLunaticHighScore", -6335495755419361090L);
        setField(term62658, term62658.getClass(), "eventWatchedDate", "LYRdIFgbgt");
        setField(term62658, term62658.getClass(), "cmEventWatchedDate", "NiKeRXajei");
        setField(term62658, term62658.getClass(), "firstGameId", "fDNtdfDzQh");
        setField(term62658, term62658.getClass(), "firstRomVersion", "VbIydgisyZ");
        setField(term62658, term62658.getClass(), "firstDataVersion", "vigaMWRpCA");
        setField(term62658, term62658.getClass(), "firstPlayDate", "sgVVVUpnau");
        setField(term62658, term62658.getClass(), "lastGameId", "xwVTgDhNdW");
        setField(term62658, term62658.getClass(), "lastRomVersion", "ruqGjVRVlD");
        setField(term62658, term62658.getClass(), "lastDataVersion", "oeoFYkQLVk");
        setField(term62658, term62658.getClass(), "compatibleCmVersion", "fibZqjUmdU");
        setField(term62658, term62658.getClass(), "lastPlayDate", "DvLIPKnbCV");
        setIntField(term62658, term62658.getClass(), "lastPlaceId", 1536563217);
        setField(term62658, term62658.getClass(), "lastPlaceName", "QwAMZyCIhS");
        setIntField(term62658, term62658.getClass(), "lastRegionId", -449582867);
        setField(term62658, term62658.getClass(), "lastRegionName", "TnLDXZoBoo");
        setIntField(term62658, term62658.getClass(), "lastAllNetId", -650176523);
        setField(term62658, term62658.getClass(), "lastClientId", "RQTElJrtwb");
        setIntField(term62658, term62658.getClass(), "lastUsedDeckId", 2071056240);
        setIntField(term62658, term62658.getClass(), "lastPlayMusicLevel", 1894657425);
        setIntField(term62658, term62658.getClass(), "lastEmoneyBrand", -263942209);
        term62921 = new Long(3290227196375641723L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term62921;
        callMethod(klass, "setSumTechMasterHighScore", argTypes, term62658, args);
    }

};


