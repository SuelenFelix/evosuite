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

public class UserPlaylog_getBossAttribute_133173854533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202074;

    public UserPlaylog_getBossAttribute_133173854533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term202080 = new Long(8010417010297313651L);
        term202074 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term202076 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term202078 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term202094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term202104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term202105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202109 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term202074, term202074.getClass(), "id", 2491271805738363558L);
        setLongField(term202076, term202076.getClass(), "id", -4158086146900353368L);
        setLongField(term202078, term202078.getClass(), "id", 464122225510516972L);
        setField(term202078, term202078.getClass(), "extId", term202080);
        setField(term202078, term202078.getClass(), "luid", "oygVMTTxqX");
        setIntField(term202095, term202095.getClass(), "year", 2025);
        setShortField(term202095, term202095.getClass(), "month", (short) 7);
        setShortField(term202095, term202095.getClass(), "day", (short) 22);
        setField(term202094, term202094.getClass(), "date", term202095);
        setByteField(term202099, term202099.getClass(), "hour", (byte) 19);
        setByteField(term202099, term202099.getClass(), "minute", (byte) 18);
        setByteField(term202099, term202099.getClass(), "second", (byte) 28);
        setIntField(term202099, term202099.getClass(), "nano", 975087142);
        setField(term202094, term202094.getClass(), "time", term202099);
        setField(term202078, term202078.getClass(), "registerTime", term202094);
        setIntField(term202105, term202105.getClass(), "year", 2018);
        setShortField(term202105, term202105.getClass(), "month", (short) 6);
        setShortField(term202105, term202105.getClass(), "day", (short) 29);
        setField(term202104, term202104.getClass(), "date", term202105);
        setByteField(term202109, term202109.getClass(), "hour", (byte) 0);
        setByteField(term202109, term202109.getClass(), "minute", (byte) 24);
        setByteField(term202109, term202109.getClass(), "second", (byte) 5);
        setIntField(term202109, term202109.getClass(), "nano", 130907665);
        setField(term202104, term202104.getClass(), "time", term202109);
        setField(term202078, term202078.getClass(), "accessTime", term202104);
        setField(term202076, term202076.getClass(), "card", term202078);
        setField(term202076, term202076.getClass(), "userName", "jmTIRLNtFD");
        setIntField(term202076, term202076.getClass(), "level", 2007733412);
        setIntField(term202076, term202076.getClass(), "reincarnationNum", 1656225426);
        setLongField(term202076, term202076.getClass(), "exp", -3959172669589189450L);
        setLongField(term202076, term202076.getClass(), "point", -8967411997264919156L);
        setLongField(term202076, term202076.getClass(), "totalPoint", 5507460304629667904L);
        setIntField(term202076, term202076.getClass(), "playCount", -309846825);
        setIntField(term202076, term202076.getClass(), "jewelCount", -1098215666);
        setIntField(term202076, term202076.getClass(), "totalJewelCount", -326389770);
        setIntField(term202076, term202076.getClass(), "medalCount", 1441423701);
        setIntField(term202076, term202076.getClass(), "playerRating", 759176631);
        setIntField(term202076, term202076.getClass(), "highestRating", -1774169672);
        setIntField(term202076, term202076.getClass(), "battlePoint", 768874655);
        setIntField(term202076, term202076.getClass(), "bestBattlePoint", -920087874);
        setIntField(term202076, term202076.getClass(), "overDamageBattlePoint", 284757557);
        setBooleanField(term202076, term202076.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term202076, term202076.getClass(), "nameplateId", 1694715875);
        setIntField(term202076, term202076.getClass(), "trophyId", 579768201);
        setIntField(term202076, term202076.getClass(), "cardId", -584126552);
        setIntField(term202076, term202076.getClass(), "characterId", -1113474160);
        setIntField(term202076, term202076.getClass(), "characterVoiceNo", 1340976691);
        setIntField(term202076, term202076.getClass(), "tabSetting", 1699954409);
        setIntField(term202076, term202076.getClass(), "tabSortSetting", -857186547);
        setIntField(term202076, term202076.getClass(), "cardCategorySetting", 1049037053);
        setIntField(term202076, term202076.getClass(), "cardSortSetting", 1720540106);
        setIntField(term202076, term202076.getClass(), "rivalScoreCategorySetting", -1295721309);
        setIntField(term202076, term202076.getClass(), "playedTutorialBit", -346108267);
        setIntField(term202076, term202076.getClass(), "firstTutorialCancelNum", -451546456);
        setLongField(term202076, term202076.getClass(), "sumTechHighScore", -6748855911016463311L);
        setLongField(term202076, term202076.getClass(), "sumTechBasicHighScore", 3049120808298443428L);
        setLongField(term202076, term202076.getClass(), "sumTechAdvancedHighScore", 1055228968683583583L);
        setLongField(term202076, term202076.getClass(), "sumTechExpertHighScore", 952928310913285609L);
        setLongField(term202076, term202076.getClass(), "sumTechMasterHighScore", 6147235856507936032L);
        setLongField(term202076, term202076.getClass(), "sumTechLunaticHighScore", 4198762320430139139L);
        setLongField(term202076, term202076.getClass(), "sumBattleHighScore", -4397952136665726238L);
        setLongField(term202076, term202076.getClass(), "sumBattleBasicHighScore", -3528212103681204139L);
        setLongField(term202076, term202076.getClass(), "sumBattleAdvancedHighScore", 8539247422584919967L);
        setLongField(term202076, term202076.getClass(), "sumBattleExpertHighScore", -7829959005110820746L);
        setLongField(term202076, term202076.getClass(), "sumBattleMasterHighScore", -5118896749637268162L);
        setLongField(term202076, term202076.getClass(), "sumBattleLunaticHighScore", -2659459795778467529L);
        setField(term202076, term202076.getClass(), "eventWatchedDate", "HJOXXPPBEy");
        setField(term202076, term202076.getClass(), "cmEventWatchedDate", "cnxLmiIatu");
        setField(term202076, term202076.getClass(), "firstGameId", "rpkeVpZPhu");
        setField(term202076, term202076.getClass(), "firstRomVersion", "uHBSUMfWOZ");
        setField(term202076, term202076.getClass(), "firstDataVersion", "xoeEmeAhlA");
        setField(term202076, term202076.getClass(), "firstPlayDate", "UISejJfFNT");
        setField(term202076, term202076.getClass(), "lastGameId", "RgLyZXkceG");
        setField(term202076, term202076.getClass(), "lastRomVersion", "mUhwqqpbkS");
        setField(term202076, term202076.getClass(), "lastDataVersion", "AJCHLiIHmt");
        setField(term202076, term202076.getClass(), "compatibleCmVersion", "LokBLFSQmd");
        setField(term202076, term202076.getClass(), "lastPlayDate", "CjawQhylQy");
        setIntField(term202076, term202076.getClass(), "lastPlaceId", -152767747);
        setField(term202076, term202076.getClass(), "lastPlaceName", "lrsQRdihYy");
        setIntField(term202076, term202076.getClass(), "lastRegionId", -1245573396);
        setField(term202076, term202076.getClass(), "lastRegionName", "hxShFHWmla");
        setIntField(term202076, term202076.getClass(), "lastAllNetId", -195140496);
        setField(term202076, term202076.getClass(), "lastClientId", "iNdFuJdkYh");
        setIntField(term202076, term202076.getClass(), "lastUsedDeckId", 76299512);
        setIntField(term202076, term202076.getClass(), "lastPlayMusicLevel", -1077055159);
        setIntField(term202076, term202076.getClass(), "lastEmoneyBrand", 1932916529);
        setField(term202074, term202074.getClass(), "user", term202076);
        setIntField(term202074, term202074.getClass(), "sortNumber", 322533988);
        setIntField(term202074, term202074.getClass(), "placeId", -1251060713);
        setField(term202074, term202074.getClass(), "placeName", "hnYavGDgbr");
        setField(term202074, term202074.getClass(), "playDate", "mcmQxsSItU");
        setField(term202074, term202074.getClass(), "userPlayDate", "ppbAxYzNBY");
        setIntField(term202074, term202074.getClass(), "musicId", -1767441785);
        setIntField(term202074, term202074.getClass(), "level", -1314126025);
        setIntField(term202074, term202074.getClass(), "playKind", -2090289623);
        setIntField(term202074, term202074.getClass(), "eventId", 1425874865);
        setField(term202074, term202074.getClass(), "eventName", "ihHWIriTVZ");
        setIntField(term202074, term202074.getClass(), "eventPoint", -1183442081);
        setIntField(term202074, term202074.getClass(), "playedUserId1", 342459522);
        setIntField(term202074, term202074.getClass(), "playedUserId2", -559688972);
        setIntField(term202074, term202074.getClass(), "playedUserId3", 927911674);
        setField(term202074, term202074.getClass(), "playedUserName1", "WgbseiBPrC");
        setField(term202074, term202074.getClass(), "playedUserName2", "wkAwDQlAAy");
        setField(term202074, term202074.getClass(), "playedUserName3", "IySCafOscV");
        setIntField(term202074, term202074.getClass(), "playedMusicLevel1", 1986936570);
        setIntField(term202074, term202074.getClass(), "playedMusicLevel2", 1896963579);
        setIntField(term202074, term202074.getClass(), "playedMusicLevel3", -255528879);
        setIntField(term202074, term202074.getClass(), "cardId1", -1688608522);
        setIntField(term202074, term202074.getClass(), "cardId2", -1799271429);
        setIntField(term202074, term202074.getClass(), "cardId3", 1073559500);
        setIntField(term202074, term202074.getClass(), "cardLevel1", 1016166965);
        setIntField(term202074, term202074.getClass(), "cardLevel2", -9310988);
        setIntField(term202074, term202074.getClass(), "cardLevel3", -1147691858);
        setIntField(term202074, term202074.getClass(), "cardAttack1", 616616334);
        setIntField(term202074, term202074.getClass(), "cardAttack2", -1969160621);
        setIntField(term202074, term202074.getClass(), "cardAttack3", -559288485);
        setIntField(term202074, term202074.getClass(), "bossCharaId", 580044418);
        setIntField(term202074, term202074.getClass(), "bossLevel", 201009830);
        setIntField(term202074, term202074.getClass(), "bossAttribute", -968129874);
        setIntField(term202074, term202074.getClass(), "clearStatus", 210247336);
        setIntField(term202074, term202074.getClass(), "techScore", 108061876);
        setIntField(term202074, term202074.getClass(), "techScoreRank", 2146109676);
        setIntField(term202074, term202074.getClass(), "battleScore", -921816721);
        setIntField(term202074, term202074.getClass(), "battleScoreRank", 11766966);
        setIntField(term202074, term202074.getClass(), "platinumScore", -2087888307);
        setIntField(term202074, term202074.getClass(), "maxCombo", -999111284);
        setIntField(term202074, term202074.getClass(), "judgeMiss", 1282305528);
        setIntField(term202074, term202074.getClass(), "judgeHit", -1610344384);
        setIntField(term202074, term202074.getClass(), "judgeBreak", -1571340466);
        setIntField(term202074, term202074.getClass(), "judgeCriticalBreak", 1334936625);
        setIntField(term202074, term202074.getClass(), "rateTap", 709928760);
        setIntField(term202074, term202074.getClass(), "rateHold", 1608610468);
        setIntField(term202074, term202074.getClass(), "rateFlick", 245689640);
        setIntField(term202074, term202074.getClass(), "rateSideTap", -82429857);
        setIntField(term202074, term202074.getClass(), "rateSideHold", 221870912);
        setIntField(term202074, term202074.getClass(), "bellCount", -60408343);
        setIntField(term202074, term202074.getClass(), "totalBellCount", 1431264881);
        setIntField(term202074, term202074.getClass(), "damageCount", 699604256);
        setIntField(term202074, term202074.getClass(), "overDamage", 977600534);
        setBooleanField(term202074, term202074.getClass(), "isTechNewRecord", true);
        setBooleanField(term202074, term202074.getClass(), "isBattleNewRecord", false);
        setBooleanField(term202074, term202074.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term202074, term202074.getClass(), "isFullCombo", false);
        setBooleanField(term202074, term202074.getClass(), "isFullBell", true);
        setBooleanField(term202074, term202074.getClass(), "isAllBreak", true);
        setIntField(term202074, term202074.getClass(), "playerRating", -1651996925);
        setIntField(term202074, term202074.getClass(), "battlePoint", -1023978027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBossAttribute", argTypes, term202074, args);
    }

};


