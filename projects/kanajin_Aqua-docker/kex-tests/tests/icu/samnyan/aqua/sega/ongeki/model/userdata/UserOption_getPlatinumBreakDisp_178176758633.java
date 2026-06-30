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

public class UserOption_getPlatinumBreakDisp_178176758633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323697;

    public UserOption_getPlatinumBreakDisp_178176758633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323703 = new Long(7065003857377879971L);
        term323697 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term323699 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term323701 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term323717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323732 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term323697, term323697.getClass(), "id", 821939633180161492L);
        setLongField(term323699, term323699.getClass(), "id", -6088612431903344353L);
        setLongField(term323701, term323701.getClass(), "id", -6835742386786279694L);
        setField(term323701, term323701.getClass(), "extId", term323703);
        setField(term323701, term323701.getClass(), "luid", "oYnemUqpQx");
        setIntField(term323718, term323718.getClass(), "year", 2020);
        setShortField(term323718, term323718.getClass(), "month", (short) 2);
        setShortField(term323718, term323718.getClass(), "day", (short) 1);
        setField(term323717, term323717.getClass(), "date", term323718);
        setByteField(term323722, term323722.getClass(), "hour", (byte) 14);
        setByteField(term323722, term323722.getClass(), "minute", (byte) 4);
        setByteField(term323722, term323722.getClass(), "second", (byte) 34);
        setIntField(term323722, term323722.getClass(), "nano", 839771089);
        setField(term323717, term323717.getClass(), "time", term323722);
        setField(term323701, term323701.getClass(), "registerTime", term323717);
        setIntField(term323728, term323728.getClass(), "year", 2019);
        setShortField(term323728, term323728.getClass(), "month", (short) 7);
        setShortField(term323728, term323728.getClass(), "day", (short) 22);
        setField(term323727, term323727.getClass(), "date", term323728);
        setByteField(term323732, term323732.getClass(), "hour", (byte) 11);
        setByteField(term323732, term323732.getClass(), "minute", (byte) 35);
        setByteField(term323732, term323732.getClass(), "second", (byte) 6);
        setIntField(term323732, term323732.getClass(), "nano", 143847417);
        setField(term323727, term323727.getClass(), "time", term323732);
        setField(term323701, term323701.getClass(), "accessTime", term323727);
        setField(term323699, term323699.getClass(), "card", term323701);
        setField(term323699, term323699.getClass(), "userName", "TTJPIYcJbN");
        setIntField(term323699, term323699.getClass(), "level", 1327940241);
        setIntField(term323699, term323699.getClass(), "reincarnationNum", -2102252492);
        setLongField(term323699, term323699.getClass(), "exp", -5671739401488736589L);
        setLongField(term323699, term323699.getClass(), "point", 6276512820873908969L);
        setLongField(term323699, term323699.getClass(), "totalPoint", 6961951630632375095L);
        setIntField(term323699, term323699.getClass(), "playCount", -765611155);
        setIntField(term323699, term323699.getClass(), "jewelCount", 2013921856);
        setIntField(term323699, term323699.getClass(), "totalJewelCount", 1111507238);
        setIntField(term323699, term323699.getClass(), "medalCount", 45638925);
        setIntField(term323699, term323699.getClass(), "playerRating", 245296907);
        setIntField(term323699, term323699.getClass(), "highestRating", -1661022394);
        setIntField(term323699, term323699.getClass(), "battlePoint", 387503969);
        setIntField(term323699, term323699.getClass(), "bestBattlePoint", -1202736660);
        setIntField(term323699, term323699.getClass(), "overDamageBattlePoint", 128063546);
        setBooleanField(term323699, term323699.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term323699, term323699.getClass(), "nameplateId", 708796296);
        setIntField(term323699, term323699.getClass(), "trophyId", 131265477);
        setIntField(term323699, term323699.getClass(), "cardId", 268467759);
        setIntField(term323699, term323699.getClass(), "characterId", -982835812);
        setIntField(term323699, term323699.getClass(), "characterVoiceNo", 1186918206);
        setIntField(term323699, term323699.getClass(), "tabSetting", -1277338163);
        setIntField(term323699, term323699.getClass(), "tabSortSetting", -583910918);
        setIntField(term323699, term323699.getClass(), "cardCategorySetting", 226497471);
        setIntField(term323699, term323699.getClass(), "cardSortSetting", 812740211);
        setIntField(term323699, term323699.getClass(), "rivalScoreCategorySetting", -1023703523);
        setIntField(term323699, term323699.getClass(), "playedTutorialBit", 1152661598);
        setIntField(term323699, term323699.getClass(), "firstTutorialCancelNum", 938746477);
        setLongField(term323699, term323699.getClass(), "sumTechHighScore", -3134554375508861954L);
        setLongField(term323699, term323699.getClass(), "sumTechBasicHighScore", -1933429020100449712L);
        setLongField(term323699, term323699.getClass(), "sumTechAdvancedHighScore", -2313990723234466018L);
        setLongField(term323699, term323699.getClass(), "sumTechExpertHighScore", 998549325378878151L);
        setLongField(term323699, term323699.getClass(), "sumTechMasterHighScore", -5894223151987660181L);
        setLongField(term323699, term323699.getClass(), "sumTechLunaticHighScore", -1674038952779660621L);
        setLongField(term323699, term323699.getClass(), "sumBattleHighScore", 2130081097113223159L);
        setLongField(term323699, term323699.getClass(), "sumBattleBasicHighScore", 6642666980893026775L);
        setLongField(term323699, term323699.getClass(), "sumBattleAdvancedHighScore", 7555248333780560078L);
        setLongField(term323699, term323699.getClass(), "sumBattleExpertHighScore", 7405480172241487432L);
        setLongField(term323699, term323699.getClass(), "sumBattleMasterHighScore", 569070290497080378L);
        setLongField(term323699, term323699.getClass(), "sumBattleLunaticHighScore", -7389455941761874093L);
        setField(term323699, term323699.getClass(), "eventWatchedDate", "fJiDaHuUft");
        setField(term323699, term323699.getClass(), "cmEventWatchedDate", "tTKBCnabIv");
        setField(term323699, term323699.getClass(), "firstGameId", "XPYkajqIOu");
        setField(term323699, term323699.getClass(), "firstRomVersion", "XLNrYhghaa");
        setField(term323699, term323699.getClass(), "firstDataVersion", "woBquSjSqe");
        setField(term323699, term323699.getClass(), "firstPlayDate", "cpgNksQHOQ");
        setField(term323699, term323699.getClass(), "lastGameId", "dLvworuTbU");
        setField(term323699, term323699.getClass(), "lastRomVersion", "PFECyYcuPr");
        setField(term323699, term323699.getClass(), "lastDataVersion", "TYhdxbIjYn");
        setField(term323699, term323699.getClass(), "compatibleCmVersion", "cPYajWLoPD");
        setField(term323699, term323699.getClass(), "lastPlayDate", "rmeWJHGDdx");
        setIntField(term323699, term323699.getClass(), "lastPlaceId", 1687946692);
        setField(term323699, term323699.getClass(), "lastPlaceName", "aagNagNlvC");
        setIntField(term323699, term323699.getClass(), "lastRegionId", -1014618629);
        setField(term323699, term323699.getClass(), "lastRegionName", "hBoeDissUn");
        setIntField(term323699, term323699.getClass(), "lastAllNetId", 74697655);
        setField(term323699, term323699.getClass(), "lastClientId", "mSsqmUpWjz");
        setIntField(term323699, term323699.getClass(), "lastUsedDeckId", 967013185);
        setIntField(term323699, term323699.getClass(), "lastPlayMusicLevel", 472032103);
        setIntField(term323699, term323699.getClass(), "lastEmoneyBrand", 1003610620);
        setField(term323697, term323697.getClass(), "user", term323699);
        setIntField(term323697, term323697.getClass(), "optionSet", 676152405);
        setIntField(term323697, term323697.getClass(), "speed", 1562834301);
        setIntField(term323697, term323697.getClass(), "mirror", 1823659119);
        setIntField(term323697, term323697.getClass(), "judgeTiming", -1957633022);
        setIntField(term323697, term323697.getClass(), "judgeAdjustment", -1701071523);
        setIntField(term323697, term323697.getClass(), "abort", 891292443);
        setIntField(term323697, term323697.getClass(), "stealthField", 1458335309);
        setIntField(term323697, term323697.getClass(), "tapSound", 937402469);
        setIntField(term323697, term323697.getClass(), "volGuide", -351951887);
        setIntField(term323697, term323697.getClass(), "volAll", -739675359);
        setIntField(term323697, term323697.getClass(), "volTap", 1286392985);
        setIntField(term323697, term323697.getClass(), "volCrTap", -1644414353);
        setIntField(term323697, term323697.getClass(), "volHold", 1296237710);
        setIntField(term323697, term323697.getClass(), "volSide", 2008810809);
        setIntField(term323697, term323697.getClass(), "volFlick", -1045846254);
        setIntField(term323697, term323697.getClass(), "volBell", 1655389198);
        setIntField(term323697, term323697.getClass(), "volEnemy", 108735158);
        setIntField(term323697, term323697.getClass(), "volSkill", -1540681088);
        setIntField(term323697, term323697.getClass(), "volDamage", -539704349);
        setIntField(term323697, term323697.getClass(), "colorField", 583242948);
        setIntField(term323697, term323697.getClass(), "colorLaneBright", -123760946);
        setIntField(term323697, term323697.getClass(), "colorWallBright", 734363550);
        setIntField(term323697, term323697.getClass(), "colorLane", -1059976664);
        setIntField(term323697, term323697.getClass(), "colorSide", -2004413471);
        setIntField(term323697, term323697.getClass(), "effectDamage", -1844277688);
        setIntField(term323697, term323697.getClass(), "effectPos", 1676012566);
        setIntField(term323697, term323697.getClass(), "judgeDisp", -1705133905);
        setIntField(term323697, term323697.getClass(), "judgePos", 2097926644);
        setIntField(term323697, term323697.getClass(), "judgeBreak", 1530366468);
        setIntField(term323697, term323697.getClass(), "judgeHit", -1567786274);
        setIntField(term323697, term323697.getClass(), "platinumBreakDisp", 622380290);
        setIntField(term323697, term323697.getClass(), "judgeCriticalBreak", -1706148481);
        setIntField(term323697, term323697.getClass(), "matching", -1921251597);
        setIntField(term323697, term323697.getClass(), "dispPlayerLv", 264900657);
        setIntField(term323697, term323697.getClass(), "dispRating", 2014160549);
        setIntField(term323697, term323697.getClass(), "dispBP", 1275772649);
        setIntField(term323697, term323697.getClass(), "headphone", 1447015677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatinumBreakDisp", argTypes, term323697, args);
    }

};


