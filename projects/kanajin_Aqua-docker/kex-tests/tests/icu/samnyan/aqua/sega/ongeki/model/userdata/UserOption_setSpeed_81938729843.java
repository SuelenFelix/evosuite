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

public class UserOption_setSpeed_81938729843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328744;
     Object term329046;

    public UserOption_setSpeed_81938729843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term328750 = new Long(742593745847006219L);
        term328744 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term328746 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term328748 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term328764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328769 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328779 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term328744, term328744.getClass(), "id", 4230351949608605592L);
        setLongField(term328746, term328746.getClass(), "id", 1351237417230921990L);
        setLongField(term328748, term328748.getClass(), "id", -4257191426253805220L);
        setField(term328748, term328748.getClass(), "extId", term328750);
        setField(term328748, term328748.getClass(), "luid", "laItnuvHbN");
        setIntField(term328765, term328765.getClass(), "year", 2024);
        setShortField(term328765, term328765.getClass(), "month", (short) 12);
        setShortField(term328765, term328765.getClass(), "day", (short) 3);
        setField(term328764, term328764.getClass(), "date", term328765);
        setByteField(term328769, term328769.getClass(), "hour", (byte) 14);
        setByteField(term328769, term328769.getClass(), "minute", (byte) 14);
        setByteField(term328769, term328769.getClass(), "second", (byte) 18);
        setIntField(term328769, term328769.getClass(), "nano", 793131232);
        setField(term328764, term328764.getClass(), "time", term328769);
        setField(term328748, term328748.getClass(), "registerTime", term328764);
        setIntField(term328775, term328775.getClass(), "year", 2017);
        setShortField(term328775, term328775.getClass(), "month", (short) 5);
        setShortField(term328775, term328775.getClass(), "day", (short) 6);
        setField(term328774, term328774.getClass(), "date", term328775);
        setByteField(term328779, term328779.getClass(), "hour", (byte) 13);
        setByteField(term328779, term328779.getClass(), "minute", (byte) 52);
        setByteField(term328779, term328779.getClass(), "second", (byte) 35);
        setIntField(term328779, term328779.getClass(), "nano", 8283927);
        setField(term328774, term328774.getClass(), "time", term328779);
        setField(term328748, term328748.getClass(), "accessTime", term328774);
        setField(term328746, term328746.getClass(), "card", term328748);
        setField(term328746, term328746.getClass(), "userName", "YZlmTsvPxB");
        setIntField(term328746, term328746.getClass(), "level", -1212633244);
        setIntField(term328746, term328746.getClass(), "reincarnationNum", 659054777);
        setLongField(term328746, term328746.getClass(), "exp", 5807583753266465773L);
        setLongField(term328746, term328746.getClass(), "point", -8360508963486794967L);
        setLongField(term328746, term328746.getClass(), "totalPoint", 8639694855712022306L);
        setIntField(term328746, term328746.getClass(), "playCount", 1890032811);
        setIntField(term328746, term328746.getClass(), "jewelCount", -530175816);
        setIntField(term328746, term328746.getClass(), "totalJewelCount", -1481797117);
        setIntField(term328746, term328746.getClass(), "medalCount", 635853784);
        setIntField(term328746, term328746.getClass(), "playerRating", 2114015707);
        setIntField(term328746, term328746.getClass(), "highestRating", 488734162);
        setIntField(term328746, term328746.getClass(), "battlePoint", 52471250);
        setIntField(term328746, term328746.getClass(), "bestBattlePoint", -1338458791);
        setIntField(term328746, term328746.getClass(), "overDamageBattlePoint", 842175384);
        setBooleanField(term328746, term328746.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term328746, term328746.getClass(), "nameplateId", -1605190950);
        setIntField(term328746, term328746.getClass(), "trophyId", 1512836245);
        setIntField(term328746, term328746.getClass(), "cardId", -752328791);
        setIntField(term328746, term328746.getClass(), "characterId", -748398831);
        setIntField(term328746, term328746.getClass(), "characterVoiceNo", 1449996511);
        setIntField(term328746, term328746.getClass(), "tabSetting", -350502680);
        setIntField(term328746, term328746.getClass(), "tabSortSetting", 493986099);
        setIntField(term328746, term328746.getClass(), "cardCategorySetting", 522321683);
        setIntField(term328746, term328746.getClass(), "cardSortSetting", 1541756812);
        setIntField(term328746, term328746.getClass(), "rivalScoreCategorySetting", 119194259);
        setIntField(term328746, term328746.getClass(), "playedTutorialBit", -928793560);
        setIntField(term328746, term328746.getClass(), "firstTutorialCancelNum", 144429690);
        setLongField(term328746, term328746.getClass(), "sumTechHighScore", -4490944181235611797L);
        setLongField(term328746, term328746.getClass(), "sumTechBasicHighScore", -157631066306455936L);
        setLongField(term328746, term328746.getClass(), "sumTechAdvancedHighScore", 5337681694826028295L);
        setLongField(term328746, term328746.getClass(), "sumTechExpertHighScore", -6397946684785740364L);
        setLongField(term328746, term328746.getClass(), "sumTechMasterHighScore", 5531305606429787803L);
        setLongField(term328746, term328746.getClass(), "sumTechLunaticHighScore", -4889741465711600860L);
        setLongField(term328746, term328746.getClass(), "sumBattleHighScore", 5300808460542894602L);
        setLongField(term328746, term328746.getClass(), "sumBattleBasicHighScore", -4559819260795253492L);
        setLongField(term328746, term328746.getClass(), "sumBattleAdvancedHighScore", -5801689416467403721L);
        setLongField(term328746, term328746.getClass(), "sumBattleExpertHighScore", -472404753060252438L);
        setLongField(term328746, term328746.getClass(), "sumBattleMasterHighScore", -4748408120876202737L);
        setLongField(term328746, term328746.getClass(), "sumBattleLunaticHighScore", 7369117215471021340L);
        setField(term328746, term328746.getClass(), "eventWatchedDate", "yErTcfFPDh");
        setField(term328746, term328746.getClass(), "cmEventWatchedDate", "pcSSrLKTkD");
        setField(term328746, term328746.getClass(), "firstGameId", "vxlSdnCUmM");
        setField(term328746, term328746.getClass(), "firstRomVersion", "PiuHpoWAqL");
        setField(term328746, term328746.getClass(), "firstDataVersion", "BgopFWdbic");
        setField(term328746, term328746.getClass(), "firstPlayDate", "JFrZgnScnM");
        setField(term328746, term328746.getClass(), "lastGameId", "JThfvXjdYb");
        setField(term328746, term328746.getClass(), "lastRomVersion", "ZBXJUQCEuy");
        setField(term328746, term328746.getClass(), "lastDataVersion", "TNojhgLvJO");
        setField(term328746, term328746.getClass(), "compatibleCmVersion", "RrxeAEUVnH");
        setField(term328746, term328746.getClass(), "lastPlayDate", "YtNcwVbVtG");
        setIntField(term328746, term328746.getClass(), "lastPlaceId", -2133232503);
        setField(term328746, term328746.getClass(), "lastPlaceName", "ULlQbnvAKy");
        setIntField(term328746, term328746.getClass(), "lastRegionId", -1349110749);
        setField(term328746, term328746.getClass(), "lastRegionName", "CpiXEDECnI");
        setIntField(term328746, term328746.getClass(), "lastAllNetId", 1700222594);
        setField(term328746, term328746.getClass(), "lastClientId", "vKpMjUVPqI");
        setIntField(term328746, term328746.getClass(), "lastUsedDeckId", 1291183587);
        setIntField(term328746, term328746.getClass(), "lastPlayMusicLevel", -560802528);
        setIntField(term328746, term328746.getClass(), "lastEmoneyBrand", -1287897675);
        setField(term328744, term328744.getClass(), "user", term328746);
        setIntField(term328744, term328744.getClass(), "optionSet", 653233733);
        setIntField(term328744, term328744.getClass(), "speed", 1815047334);
        setIntField(term328744, term328744.getClass(), "mirror", -575767005);
        setIntField(term328744, term328744.getClass(), "judgeTiming", -1182414572);
        setIntField(term328744, term328744.getClass(), "judgeAdjustment", 1185482247);
        setIntField(term328744, term328744.getClass(), "abort", 1568253187);
        setIntField(term328744, term328744.getClass(), "stealthField", -280594931);
        setIntField(term328744, term328744.getClass(), "tapSound", -1021875450);
        setIntField(term328744, term328744.getClass(), "volGuide", -1343310413);
        setIntField(term328744, term328744.getClass(), "volAll", -1886071910);
        setIntField(term328744, term328744.getClass(), "volTap", -1520235161);
        setIntField(term328744, term328744.getClass(), "volCrTap", -852029982);
        setIntField(term328744, term328744.getClass(), "volHold", -383482999);
        setIntField(term328744, term328744.getClass(), "volSide", -1807941088);
        setIntField(term328744, term328744.getClass(), "volFlick", 1234028909);
        setIntField(term328744, term328744.getClass(), "volBell", 1952002406);
        setIntField(term328744, term328744.getClass(), "volEnemy", -527177368);
        setIntField(term328744, term328744.getClass(), "volSkill", 1343714639);
        setIntField(term328744, term328744.getClass(), "volDamage", -237644559);
        setIntField(term328744, term328744.getClass(), "colorField", -1365126201);
        setIntField(term328744, term328744.getClass(), "colorLaneBright", 1562847823);
        setIntField(term328744, term328744.getClass(), "colorWallBright", -97710562);
        setIntField(term328744, term328744.getClass(), "colorLane", -282059906);
        setIntField(term328744, term328744.getClass(), "colorSide", 1617057800);
        setIntField(term328744, term328744.getClass(), "effectDamage", -2107384799);
        setIntField(term328744, term328744.getClass(), "effectPos", 1577912882);
        setIntField(term328744, term328744.getClass(), "judgeDisp", 840659647);
        setIntField(term328744, term328744.getClass(), "judgePos", -1822491249);
        setIntField(term328744, term328744.getClass(), "judgeBreak", 1457375656);
        setIntField(term328744, term328744.getClass(), "judgeHit", 628545427);
        setIntField(term328744, term328744.getClass(), "platinumBreakDisp", 2115204641);
        setIntField(term328744, term328744.getClass(), "judgeCriticalBreak", 1127988468);
        setIntField(term328744, term328744.getClass(), "matching", 140996827);
        setIntField(term328744, term328744.getClass(), "dispPlayerLv", -786370653);
        setIntField(term328744, term328744.getClass(), "dispRating", 1877145783);
        setIntField(term328744, term328744.getClass(), "dispBP", -686186980);
        setIntField(term328744, term328744.getClass(), "headphone", -1042964125);
        term329046 = new Integer(387837259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term329046;
        callMethod(klass, "setSpeed", argTypes, term328744, args);
    }

};


