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

public class UserPlaylog_getOverDamage_136075067353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214714;

    public UserPlaylog_getOverDamage_136075067353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term214720 = new Long(1193381106528373019L);
        term214714 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term214716 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term214718 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term214734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term214744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214749 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term214714, term214714.getClass(), "id", -5395570594601954511L);
        setLongField(term214716, term214716.getClass(), "id", -2138139617859519044L);
        setLongField(term214718, term214718.getClass(), "id", -945634812351574587L);
        setField(term214718, term214718.getClass(), "extId", term214720);
        setField(term214718, term214718.getClass(), "luid", "acbKooiVyt");
        setIntField(term214735, term214735.getClass(), "year", 2029);
        setShortField(term214735, term214735.getClass(), "month", (short) 8);
        setShortField(term214735, term214735.getClass(), "day", (short) 27);
        setField(term214734, term214734.getClass(), "date", term214735);
        setByteField(term214739, term214739.getClass(), "hour", (byte) 10);
        setByteField(term214739, term214739.getClass(), "minute", (byte) 54);
        setByteField(term214739, term214739.getClass(), "second", (byte) 17);
        setIntField(term214739, term214739.getClass(), "nano", 953558700);
        setField(term214734, term214734.getClass(), "time", term214739);
        setField(term214718, term214718.getClass(), "registerTime", term214734);
        setIntField(term214745, term214745.getClass(), "year", 2012);
        setShortField(term214745, term214745.getClass(), "month", (short) 1);
        setShortField(term214745, term214745.getClass(), "day", (short) 12);
        setField(term214744, term214744.getClass(), "date", term214745);
        setByteField(term214749, term214749.getClass(), "hour", (byte) 16);
        setByteField(term214749, term214749.getClass(), "minute", (byte) 4);
        setByteField(term214749, term214749.getClass(), "second", (byte) 10);
        setIntField(term214749, term214749.getClass(), "nano", 245911854);
        setField(term214744, term214744.getClass(), "time", term214749);
        setField(term214718, term214718.getClass(), "accessTime", term214744);
        setField(term214716, term214716.getClass(), "card", term214718);
        setField(term214716, term214716.getClass(), "userName", "MdFuelPZIq");
        setIntField(term214716, term214716.getClass(), "level", -294164949);
        setIntField(term214716, term214716.getClass(), "reincarnationNum", 1240900440);
        setLongField(term214716, term214716.getClass(), "exp", 4804264407297537936L);
        setLongField(term214716, term214716.getClass(), "point", -3802999224635376611L);
        setLongField(term214716, term214716.getClass(), "totalPoint", -1638779219901812994L);
        setIntField(term214716, term214716.getClass(), "playCount", 1227926827);
        setIntField(term214716, term214716.getClass(), "jewelCount", -1056033776);
        setIntField(term214716, term214716.getClass(), "totalJewelCount", 484119496);
        setIntField(term214716, term214716.getClass(), "medalCount", 1357038884);
        setIntField(term214716, term214716.getClass(), "playerRating", 990002371);
        setIntField(term214716, term214716.getClass(), "highestRating", -67320068);
        setIntField(term214716, term214716.getClass(), "battlePoint", -1718166515);
        setIntField(term214716, term214716.getClass(), "bestBattlePoint", -1003939669);
        setIntField(term214716, term214716.getClass(), "overDamageBattlePoint", 1632574348);
        setBooleanField(term214716, term214716.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term214716, term214716.getClass(), "nameplateId", -334489756);
        setIntField(term214716, term214716.getClass(), "trophyId", -1587831293);
        setIntField(term214716, term214716.getClass(), "cardId", 139569150);
        setIntField(term214716, term214716.getClass(), "characterId", -1587632260);
        setIntField(term214716, term214716.getClass(), "characterVoiceNo", 1221611988);
        setIntField(term214716, term214716.getClass(), "tabSetting", 425460974);
        setIntField(term214716, term214716.getClass(), "tabSortSetting", -405289097);
        setIntField(term214716, term214716.getClass(), "cardCategorySetting", -1702410002);
        setIntField(term214716, term214716.getClass(), "cardSortSetting", 1231954187);
        setIntField(term214716, term214716.getClass(), "rivalScoreCategorySetting", 804645296);
        setIntField(term214716, term214716.getClass(), "playedTutorialBit", -1460116142);
        setIntField(term214716, term214716.getClass(), "firstTutorialCancelNum", -17478491);
        setLongField(term214716, term214716.getClass(), "sumTechHighScore", 2815686903333436830L);
        setLongField(term214716, term214716.getClass(), "sumTechBasicHighScore", -4726990010795804697L);
        setLongField(term214716, term214716.getClass(), "sumTechAdvancedHighScore", 18115689564627037L);
        setLongField(term214716, term214716.getClass(), "sumTechExpertHighScore", -6649862739070461398L);
        setLongField(term214716, term214716.getClass(), "sumTechMasterHighScore", 5437696365924758973L);
        setLongField(term214716, term214716.getClass(), "sumTechLunaticHighScore", 3839192148499886301L);
        setLongField(term214716, term214716.getClass(), "sumBattleHighScore", -7160579949074592420L);
        setLongField(term214716, term214716.getClass(), "sumBattleBasicHighScore", -3750069780213532199L);
        setLongField(term214716, term214716.getClass(), "sumBattleAdvancedHighScore", -8477618123087365585L);
        setLongField(term214716, term214716.getClass(), "sumBattleExpertHighScore", -1293962831337793157L);
        setLongField(term214716, term214716.getClass(), "sumBattleMasterHighScore", -8600281105080826389L);
        setLongField(term214716, term214716.getClass(), "sumBattleLunaticHighScore", -5600163086356818263L);
        setField(term214716, term214716.getClass(), "eventWatchedDate", "ixzZuaWsYL");
        setField(term214716, term214716.getClass(), "cmEventWatchedDate", "CUkbIipVrl");
        setField(term214716, term214716.getClass(), "firstGameId", "xbQLgvzCPz");
        setField(term214716, term214716.getClass(), "firstRomVersion", "XHGONyJIOI");
        setField(term214716, term214716.getClass(), "firstDataVersion", "EgnNSamGhM");
        setField(term214716, term214716.getClass(), "firstPlayDate", "IjhiBHnJgI");
        setField(term214716, term214716.getClass(), "lastGameId", "QxAHzfZVve");
        setField(term214716, term214716.getClass(), "lastRomVersion", "xoqSauYvkW");
        setField(term214716, term214716.getClass(), "lastDataVersion", "cErqWEXoNv");
        setField(term214716, term214716.getClass(), "compatibleCmVersion", "lxTtgYEUNY");
        setField(term214716, term214716.getClass(), "lastPlayDate", "UgDLKYCyKA");
        setIntField(term214716, term214716.getClass(), "lastPlaceId", -1929569879);
        setField(term214716, term214716.getClass(), "lastPlaceName", "DepyVBcXry");
        setIntField(term214716, term214716.getClass(), "lastRegionId", 474343023);
        setField(term214716, term214716.getClass(), "lastRegionName", "niKvJJXdeU");
        setIntField(term214716, term214716.getClass(), "lastAllNetId", -1990377854);
        setField(term214716, term214716.getClass(), "lastClientId", "mJgellfeNf");
        setIntField(term214716, term214716.getClass(), "lastUsedDeckId", -1737041392);
        setIntField(term214716, term214716.getClass(), "lastPlayMusicLevel", 1664920870);
        setIntField(term214716, term214716.getClass(), "lastEmoneyBrand", 921567349);
        setField(term214714, term214714.getClass(), "user", term214716);
        setIntField(term214714, term214714.getClass(), "sortNumber", 495324354);
        setIntField(term214714, term214714.getClass(), "placeId", 974817743);
        setField(term214714, term214714.getClass(), "placeName", "gPuHFpKpgV");
        setField(term214714, term214714.getClass(), "playDate", "QZttLDZgnr");
        setField(term214714, term214714.getClass(), "userPlayDate", "RTIZssHrmC");
        setIntField(term214714, term214714.getClass(), "musicId", 1644746758);
        setIntField(term214714, term214714.getClass(), "level", -2021487528);
        setIntField(term214714, term214714.getClass(), "playKind", -431095319);
        setIntField(term214714, term214714.getClass(), "eventId", -532520843);
        setField(term214714, term214714.getClass(), "eventName", "JjSHZkcGOm");
        setIntField(term214714, term214714.getClass(), "eventPoint", 1063976778);
        setIntField(term214714, term214714.getClass(), "playedUserId1", -2086752166);
        setIntField(term214714, term214714.getClass(), "playedUserId2", 100476034);
        setIntField(term214714, term214714.getClass(), "playedUserId3", 312816015);
        setField(term214714, term214714.getClass(), "playedUserName1", "AYriOKQIPd");
        setField(term214714, term214714.getClass(), "playedUserName2", "KAEOLEfusb");
        setField(term214714, term214714.getClass(), "playedUserName3", "LFDnNsBZdo");
        setIntField(term214714, term214714.getClass(), "playedMusicLevel1", -1965641431);
        setIntField(term214714, term214714.getClass(), "playedMusicLevel2", 1087645970);
        setIntField(term214714, term214714.getClass(), "playedMusicLevel3", 1832542619);
        setIntField(term214714, term214714.getClass(), "cardId1", -892031259);
        setIntField(term214714, term214714.getClass(), "cardId2", 1353006335);
        setIntField(term214714, term214714.getClass(), "cardId3", -943705013);
        setIntField(term214714, term214714.getClass(), "cardLevel1", 1210869725);
        setIntField(term214714, term214714.getClass(), "cardLevel2", -1098995713);
        setIntField(term214714, term214714.getClass(), "cardLevel3", 1553880710);
        setIntField(term214714, term214714.getClass(), "cardAttack1", -1228290517);
        setIntField(term214714, term214714.getClass(), "cardAttack2", 1650761692);
        setIntField(term214714, term214714.getClass(), "cardAttack3", -888914454);
        setIntField(term214714, term214714.getClass(), "bossCharaId", -1836369853);
        setIntField(term214714, term214714.getClass(), "bossLevel", -2069140329);
        setIntField(term214714, term214714.getClass(), "bossAttribute", -1240410704);
        setIntField(term214714, term214714.getClass(), "clearStatus", 946474812);
        setIntField(term214714, term214714.getClass(), "techScore", 1102379330);
        setIntField(term214714, term214714.getClass(), "techScoreRank", -1473411882);
        setIntField(term214714, term214714.getClass(), "battleScore", 1302685636);
        setIntField(term214714, term214714.getClass(), "battleScoreRank", -1202675628);
        setIntField(term214714, term214714.getClass(), "platinumScore", -117044732);
        setIntField(term214714, term214714.getClass(), "maxCombo", -912545932);
        setIntField(term214714, term214714.getClass(), "judgeMiss", -323859);
        setIntField(term214714, term214714.getClass(), "judgeHit", 181699558);
        setIntField(term214714, term214714.getClass(), "judgeBreak", -258863944);
        setIntField(term214714, term214714.getClass(), "judgeCriticalBreak", 634023528);
        setIntField(term214714, term214714.getClass(), "rateTap", -1426549826);
        setIntField(term214714, term214714.getClass(), "rateHold", 1932134326);
        setIntField(term214714, term214714.getClass(), "rateFlick", -909738839);
        setIntField(term214714, term214714.getClass(), "rateSideTap", 271645048);
        setIntField(term214714, term214714.getClass(), "rateSideHold", 1234306330);
        setIntField(term214714, term214714.getClass(), "bellCount", 146827683);
        setIntField(term214714, term214714.getClass(), "totalBellCount", 347724024);
        setIntField(term214714, term214714.getClass(), "damageCount", 1273746652);
        setIntField(term214714, term214714.getClass(), "overDamage", 1282163721);
        setBooleanField(term214714, term214714.getClass(), "isTechNewRecord", false);
        setBooleanField(term214714, term214714.getClass(), "isBattleNewRecord", true);
        setBooleanField(term214714, term214714.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term214714, term214714.getClass(), "isFullCombo", true);
        setBooleanField(term214714, term214714.getClass(), "isFullBell", true);
        setBooleanField(term214714, term214714.getClass(), "isAllBreak", true);
        setIntField(term214714, term214714.getClass(), "playerRating", 603248870);
        setIntField(term214714, term214714.getClass(), "battlePoint", -1909045622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverDamage", argTypes, term214714, args);
    }

};


