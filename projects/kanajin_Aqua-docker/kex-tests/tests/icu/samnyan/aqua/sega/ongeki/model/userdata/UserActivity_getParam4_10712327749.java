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

public class UserActivity_getParam4_10712327749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286610;

    public UserActivity_getParam4_10712327749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term286616 = new Long(3951346165629352117L);
        term286610 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term286612 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term286614 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term286630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286645 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term286610, term286610.getClass(), "id", -4350687351210537079L);
        setLongField(term286612, term286612.getClass(), "id", 7618549616059494639L);
        setLongField(term286614, term286614.getClass(), "id", -1334094674576244243L);
        setField(term286614, term286614.getClass(), "extId", term286616);
        setField(term286614, term286614.getClass(), "luid", "MzSJDcOtLM");
        setIntField(term286631, term286631.getClass(), "year", 2014);
        setShortField(term286631, term286631.getClass(), "month", (short) 11);
        setShortField(term286631, term286631.getClass(), "day", (short) 17);
        setField(term286630, term286630.getClass(), "date", term286631);
        setByteField(term286635, term286635.getClass(), "hour", (byte) 6);
        setByteField(term286635, term286635.getClass(), "minute", (byte) 54);
        setByteField(term286635, term286635.getClass(), "second", (byte) 9);
        setIntField(term286635, term286635.getClass(), "nano", 835903486);
        setField(term286630, term286630.getClass(), "time", term286635);
        setField(term286614, term286614.getClass(), "registerTime", term286630);
        setIntField(term286641, term286641.getClass(), "year", 2012);
        setShortField(term286641, term286641.getClass(), "month", (short) 6);
        setShortField(term286641, term286641.getClass(), "day", (short) 11);
        setField(term286640, term286640.getClass(), "date", term286641);
        setByteField(term286645, term286645.getClass(), "hour", (byte) 10);
        setByteField(term286645, term286645.getClass(), "minute", (byte) 13);
        setByteField(term286645, term286645.getClass(), "second", (byte) 15);
        setIntField(term286645, term286645.getClass(), "nano", 398872626);
        setField(term286640, term286640.getClass(), "time", term286645);
        setField(term286614, term286614.getClass(), "accessTime", term286640);
        setField(term286612, term286612.getClass(), "card", term286614);
        setField(term286612, term286612.getClass(), "userName", "GsuZHmLIYX");
        setIntField(term286612, term286612.getClass(), "level", -1555312883);
        setIntField(term286612, term286612.getClass(), "reincarnationNum", -168913232);
        setLongField(term286612, term286612.getClass(), "exp", -6150774127547742228L);
        setLongField(term286612, term286612.getClass(), "point", 3345205140503988186L);
        setLongField(term286612, term286612.getClass(), "totalPoint", -4777330889896489761L);
        setIntField(term286612, term286612.getClass(), "playCount", 1280762019);
        setIntField(term286612, term286612.getClass(), "jewelCount", 1067531027);
        setIntField(term286612, term286612.getClass(), "totalJewelCount", 837236889);
        setIntField(term286612, term286612.getClass(), "medalCount", 1109328835);
        setIntField(term286612, term286612.getClass(), "playerRating", -1333962836);
        setIntField(term286612, term286612.getClass(), "highestRating", 526430292);
        setIntField(term286612, term286612.getClass(), "battlePoint", 1063744494);
        setIntField(term286612, term286612.getClass(), "bestBattlePoint", 111922554);
        setIntField(term286612, term286612.getClass(), "overDamageBattlePoint", -1273898792);
        setBooleanField(term286612, term286612.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term286612, term286612.getClass(), "nameplateId", -889929952);
        setIntField(term286612, term286612.getClass(), "trophyId", -711257198);
        setIntField(term286612, term286612.getClass(), "cardId", 1109783759);
        setIntField(term286612, term286612.getClass(), "characterId", 730930342);
        setIntField(term286612, term286612.getClass(), "characterVoiceNo", 1542202966);
        setIntField(term286612, term286612.getClass(), "tabSetting", -490456970);
        setIntField(term286612, term286612.getClass(), "tabSortSetting", -247072244);
        setIntField(term286612, term286612.getClass(), "cardCategorySetting", 2038802976);
        setIntField(term286612, term286612.getClass(), "cardSortSetting", 1513737010);
        setIntField(term286612, term286612.getClass(), "rivalScoreCategorySetting", -877125437);
        setIntField(term286612, term286612.getClass(), "playedTutorialBit", 894418485);
        setIntField(term286612, term286612.getClass(), "firstTutorialCancelNum", 311233853);
        setLongField(term286612, term286612.getClass(), "sumTechHighScore", -1170726416454573602L);
        setLongField(term286612, term286612.getClass(), "sumTechBasicHighScore", 1093940000372559026L);
        setLongField(term286612, term286612.getClass(), "sumTechAdvancedHighScore", 5353349380789631054L);
        setLongField(term286612, term286612.getClass(), "sumTechExpertHighScore", -1685606520924740833L);
        setLongField(term286612, term286612.getClass(), "sumTechMasterHighScore", 8756262167416269161L);
        setLongField(term286612, term286612.getClass(), "sumTechLunaticHighScore", -3642073325878431885L);
        setLongField(term286612, term286612.getClass(), "sumBattleHighScore", -1739556940317928004L);
        setLongField(term286612, term286612.getClass(), "sumBattleBasicHighScore", -1580204826461662829L);
        setLongField(term286612, term286612.getClass(), "sumBattleAdvancedHighScore", 6631246796040195783L);
        setLongField(term286612, term286612.getClass(), "sumBattleExpertHighScore", 8629466361829372740L);
        setLongField(term286612, term286612.getClass(), "sumBattleMasterHighScore", -9016290238550406176L);
        setLongField(term286612, term286612.getClass(), "sumBattleLunaticHighScore", 3540613881287385510L);
        setField(term286612, term286612.getClass(), "eventWatchedDate", "UnZGDLrFWQ");
        setField(term286612, term286612.getClass(), "cmEventWatchedDate", "zKUSldypzp");
        setField(term286612, term286612.getClass(), "firstGameId", "DZyNInpLTr");
        setField(term286612, term286612.getClass(), "firstRomVersion", "RPeGSfMGcA");
        setField(term286612, term286612.getClass(), "firstDataVersion", "dhopMnOrLY");
        setField(term286612, term286612.getClass(), "firstPlayDate", "wsnRKetsGI");
        setField(term286612, term286612.getClass(), "lastGameId", "QLytkOkJsd");
        setField(term286612, term286612.getClass(), "lastRomVersion", "CExchqIigF");
        setField(term286612, term286612.getClass(), "lastDataVersion", "fNWyHowvJR");
        setField(term286612, term286612.getClass(), "compatibleCmVersion", "synCfIOSuZ");
        setField(term286612, term286612.getClass(), "lastPlayDate", "nYiDbDJWoP");
        setIntField(term286612, term286612.getClass(), "lastPlaceId", 2105194977);
        setField(term286612, term286612.getClass(), "lastPlaceName", "dytNsIZeKc");
        setIntField(term286612, term286612.getClass(), "lastRegionId", 2074238681);
        setField(term286612, term286612.getClass(), "lastRegionName", "VVfxhVBDZu");
        setIntField(term286612, term286612.getClass(), "lastAllNetId", -1655797819);
        setField(term286612, term286612.getClass(), "lastClientId", "eeNpiPOYFc");
        setIntField(term286612, term286612.getClass(), "lastUsedDeckId", 101683079);
        setIntField(term286612, term286612.getClass(), "lastPlayMusicLevel", 1648565080);
        setIntField(term286612, term286612.getClass(), "lastEmoneyBrand", 840301715);
        setField(term286610, term286610.getClass(), "user", term286612);
        setIntField(term286610, term286610.getClass(), "kind", -1010819427);
        setIntField(term286610, term286610.getClass(), "activityId", 942167805);
        setIntField(term286610, term286610.getClass(), "sortNumber", -270257056);
        setIntField(term286610, term286610.getClass(), "param1", 972492496);
        setIntField(term286610, term286610.getClass(), "param2", -2143210695);
        setIntField(term286610, term286610.getClass(), "param3", -1464463559);
        setIntField(term286610, term286610.getClass(), "param4", -1213545995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam4", argTypes, term286610, args);
    }

};


