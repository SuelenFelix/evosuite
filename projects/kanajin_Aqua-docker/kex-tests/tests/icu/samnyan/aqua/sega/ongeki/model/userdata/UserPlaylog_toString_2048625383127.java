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

public class UserPlaylog_toString_2048625383127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262169;

    public UserPlaylog_toString_2048625383127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term262175 = new Long(-6503611645609982617L);
        term262169 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term262171 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term262173 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term262189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262194 = newInstance(Class.forName("java.time.LocalTime"));
        Object term262199 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262204 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term262169, term262169.getClass(), "id", -1089262331970772423L);
        setLongField(term262171, term262171.getClass(), "id", -2551255033424087802L);
        setLongField(term262173, term262173.getClass(), "id", 9073080424968034558L);
        setField(term262173, term262173.getClass(), "extId", term262175);
        setField(term262173, term262173.getClass(), "luid", "oucuJZavwE");
        setIntField(term262190, term262190.getClass(), "year", 2026);
        setShortField(term262190, term262190.getClass(), "month", (short) 9);
        setShortField(term262190, term262190.getClass(), "day", (short) 24);
        setField(term262189, term262189.getClass(), "date", term262190);
        setByteField(term262194, term262194.getClass(), "hour", (byte) 18);
        setByteField(term262194, term262194.getClass(), "minute", (byte) 13);
        setByteField(term262194, term262194.getClass(), "second", (byte) 45);
        setIntField(term262194, term262194.getClass(), "nano", 781256845);
        setField(term262189, term262189.getClass(), "time", term262194);
        setField(term262173, term262173.getClass(), "registerTime", term262189);
        setIntField(term262200, term262200.getClass(), "year", 2024);
        setShortField(term262200, term262200.getClass(), "month", (short) 12);
        setShortField(term262200, term262200.getClass(), "day", (short) 18);
        setField(term262199, term262199.getClass(), "date", term262200);
        setByteField(term262204, term262204.getClass(), "hour", (byte) 2);
        setByteField(term262204, term262204.getClass(), "minute", (byte) 55);
        setByteField(term262204, term262204.getClass(), "second", (byte) 45);
        setIntField(term262204, term262204.getClass(), "nano", 631411071);
        setField(term262199, term262199.getClass(), "time", term262204);
        setField(term262173, term262173.getClass(), "accessTime", term262199);
        setField(term262171, term262171.getClass(), "card", term262173);
        setField(term262171, term262171.getClass(), "userName", "wZoQWYVMQg");
        setIntField(term262171, term262171.getClass(), "level", -1238229215);
        setIntField(term262171, term262171.getClass(), "reincarnationNum", 1604817674);
        setLongField(term262171, term262171.getClass(), "exp", 1084054996097126548L);
        setLongField(term262171, term262171.getClass(), "point", 6077985729139464999L);
        setLongField(term262171, term262171.getClass(), "totalPoint", 1305021030177562968L);
        setIntField(term262171, term262171.getClass(), "playCount", 1716104970);
        setIntField(term262171, term262171.getClass(), "jewelCount", 611301077);
        setIntField(term262171, term262171.getClass(), "totalJewelCount", 1776391412);
        setIntField(term262171, term262171.getClass(), "medalCount", 206840742);
        setIntField(term262171, term262171.getClass(), "playerRating", 2082328508);
        setIntField(term262171, term262171.getClass(), "highestRating", -162243930);
        setIntField(term262171, term262171.getClass(), "battlePoint", 872217662);
        setIntField(term262171, term262171.getClass(), "bestBattlePoint", 1675988214);
        setIntField(term262171, term262171.getClass(), "overDamageBattlePoint", 72481893);
        setBooleanField(term262171, term262171.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term262171, term262171.getClass(), "nameplateId", -1835966293);
        setIntField(term262171, term262171.getClass(), "trophyId", -408154519);
        setIntField(term262171, term262171.getClass(), "cardId", -300777303);
        setIntField(term262171, term262171.getClass(), "characterId", 1741476389);
        setIntField(term262171, term262171.getClass(), "characterVoiceNo", 785777431);
        setIntField(term262171, term262171.getClass(), "tabSetting", -1694371655);
        setIntField(term262171, term262171.getClass(), "tabSortSetting", -1608823920);
        setIntField(term262171, term262171.getClass(), "cardCategorySetting", 1821563586);
        setIntField(term262171, term262171.getClass(), "cardSortSetting", -607557315);
        setIntField(term262171, term262171.getClass(), "rivalScoreCategorySetting", -860984329);
        setIntField(term262171, term262171.getClass(), "playedTutorialBit", -1536434576);
        setIntField(term262171, term262171.getClass(), "firstTutorialCancelNum", -987576592);
        setLongField(term262171, term262171.getClass(), "sumTechHighScore", 956525760002044410L);
        setLongField(term262171, term262171.getClass(), "sumTechBasicHighScore", 7908063799140277012L);
        setLongField(term262171, term262171.getClass(), "sumTechAdvancedHighScore", -3992722525798409069L);
        setLongField(term262171, term262171.getClass(), "sumTechExpertHighScore", -1163015358945210739L);
        setLongField(term262171, term262171.getClass(), "sumTechMasterHighScore", 85615018786024272L);
        setLongField(term262171, term262171.getClass(), "sumTechLunaticHighScore", -24295254511972976L);
        setLongField(term262171, term262171.getClass(), "sumBattleHighScore", -2635740287680418450L);
        setLongField(term262171, term262171.getClass(), "sumBattleBasicHighScore", 2870533322468936501L);
        setLongField(term262171, term262171.getClass(), "sumBattleAdvancedHighScore", 2011435754693350644L);
        setLongField(term262171, term262171.getClass(), "sumBattleExpertHighScore", -2623273801109504921L);
        setLongField(term262171, term262171.getClass(), "sumBattleMasterHighScore", -5669134296599186225L);
        setLongField(term262171, term262171.getClass(), "sumBattleLunaticHighScore", 4635334694620019875L);
        setField(term262171, term262171.getClass(), "eventWatchedDate", "WFCgxTJVwD");
        setField(term262171, term262171.getClass(), "cmEventWatchedDate", "KUUxlthDsn");
        setField(term262171, term262171.getClass(), "firstGameId", "almiLtzMxP");
        setField(term262171, term262171.getClass(), "firstRomVersion", "qJJVKWtQic");
        setField(term262171, term262171.getClass(), "firstDataVersion", "kugTVFFpsO");
        setField(term262171, term262171.getClass(), "firstPlayDate", "DWtHUNpDzA");
        setField(term262171, term262171.getClass(), "lastGameId", "rcBporRNoY");
        setField(term262171, term262171.getClass(), "lastRomVersion", "dsKVyjqQzX");
        setField(term262171, term262171.getClass(), "lastDataVersion", "NSLutnlusQ");
        setField(term262171, term262171.getClass(), "compatibleCmVersion", "ACojQtFFkc");
        setField(term262171, term262171.getClass(), "lastPlayDate", "fsNoWwYRcl");
        setIntField(term262171, term262171.getClass(), "lastPlaceId", 442011273);
        setField(term262171, term262171.getClass(), "lastPlaceName", "kmSalAbExi");
        setIntField(term262171, term262171.getClass(), "lastRegionId", 1956149843);
        setField(term262171, term262171.getClass(), "lastRegionName", "WaoIDVIlvl");
        setIntField(term262171, term262171.getClass(), "lastAllNetId", -837480422);
        setField(term262171, term262171.getClass(), "lastClientId", "ZjRzXtkOnD");
        setIntField(term262171, term262171.getClass(), "lastUsedDeckId", 1860470993);
        setIntField(term262171, term262171.getClass(), "lastPlayMusicLevel", -863558477);
        setIntField(term262171, term262171.getClass(), "lastEmoneyBrand", -671527034);
        setField(term262169, term262169.getClass(), "user", term262171);
        setIntField(term262169, term262169.getClass(), "sortNumber", -355504967);
        setIntField(term262169, term262169.getClass(), "placeId", 487658174);
        setField(term262169, term262169.getClass(), "placeName", "aBYmFDsROK");
        setField(term262169, term262169.getClass(), "playDate", "GtdCGkdhcP");
        setField(term262169, term262169.getClass(), "userPlayDate", "hcCiadryUN");
        setIntField(term262169, term262169.getClass(), "musicId", -1003494096);
        setIntField(term262169, term262169.getClass(), "level", -916635849);
        setIntField(term262169, term262169.getClass(), "playKind", -292870550);
        setIntField(term262169, term262169.getClass(), "eventId", 932232775);
        setField(term262169, term262169.getClass(), "eventName", "xHANisEhHP");
        setIntField(term262169, term262169.getClass(), "eventPoint", -2014050836);
        setIntField(term262169, term262169.getClass(), "playedUserId1", 1398941087);
        setIntField(term262169, term262169.getClass(), "playedUserId2", 1739979538);
        setIntField(term262169, term262169.getClass(), "playedUserId3", -525688968);
        setField(term262169, term262169.getClass(), "playedUserName1", "jlmmzUmQxH");
        setField(term262169, term262169.getClass(), "playedUserName2", "RuYeeRfuJU");
        setField(term262169, term262169.getClass(), "playedUserName3", "prwDXCPkFo");
        setIntField(term262169, term262169.getClass(), "playedMusicLevel1", -27212490);
        setIntField(term262169, term262169.getClass(), "playedMusicLevel2", -262064529);
        setIntField(term262169, term262169.getClass(), "playedMusicLevel3", 882451306);
        setIntField(term262169, term262169.getClass(), "cardId1", 1363101790);
        setIntField(term262169, term262169.getClass(), "cardId2", 877478140);
        setIntField(term262169, term262169.getClass(), "cardId3", -877898256);
        setIntField(term262169, term262169.getClass(), "cardLevel1", -843145378);
        setIntField(term262169, term262169.getClass(), "cardLevel2", -1108492087);
        setIntField(term262169, term262169.getClass(), "cardLevel3", -2065560265);
        setIntField(term262169, term262169.getClass(), "cardAttack1", -387620756);
        setIntField(term262169, term262169.getClass(), "cardAttack2", -126979177);
        setIntField(term262169, term262169.getClass(), "cardAttack3", -131484078);
        setIntField(term262169, term262169.getClass(), "bossCharaId", -622903896);
        setIntField(term262169, term262169.getClass(), "bossLevel", -445119540);
        setIntField(term262169, term262169.getClass(), "bossAttribute", 2085203030);
        setIntField(term262169, term262169.getClass(), "clearStatus", 2033592479);
        setIntField(term262169, term262169.getClass(), "techScore", 1523373764);
        setIntField(term262169, term262169.getClass(), "techScoreRank", -1381691518);
        setIntField(term262169, term262169.getClass(), "battleScore", -1055770237);
        setIntField(term262169, term262169.getClass(), "battleScoreRank", 1516770789);
        setIntField(term262169, term262169.getClass(), "platinumScore", -2146641428);
        setIntField(term262169, term262169.getClass(), "maxCombo", 1813536424);
        setIntField(term262169, term262169.getClass(), "judgeMiss", -1827932155);
        setIntField(term262169, term262169.getClass(), "judgeHit", -1840714834);
        setIntField(term262169, term262169.getClass(), "judgeBreak", 42295520);
        setIntField(term262169, term262169.getClass(), "judgeCriticalBreak", 250658921);
        setIntField(term262169, term262169.getClass(), "rateTap", -699106220);
        setIntField(term262169, term262169.getClass(), "rateHold", 1231601627);
        setIntField(term262169, term262169.getClass(), "rateFlick", -619938699);
        setIntField(term262169, term262169.getClass(), "rateSideTap", 2041807519);
        setIntField(term262169, term262169.getClass(), "rateSideHold", -1588301237);
        setIntField(term262169, term262169.getClass(), "bellCount", 674010604);
        setIntField(term262169, term262169.getClass(), "totalBellCount", -1993946490);
        setIntField(term262169, term262169.getClass(), "damageCount", 1192985277);
        setIntField(term262169, term262169.getClass(), "overDamage", 356951618);
        setBooleanField(term262169, term262169.getClass(), "isTechNewRecord", true);
        setBooleanField(term262169, term262169.getClass(), "isBattleNewRecord", false);
        setBooleanField(term262169, term262169.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term262169, term262169.getClass(), "isFullCombo", false);
        setBooleanField(term262169, term262169.getClass(), "isFullBell", false);
        setBooleanField(term262169, term262169.getClass(), "isAllBreak", false);
        setIntField(term262169, term262169.getClass(), "playerRating", -1864027009);
        setIntField(term262169, term262169.getClass(), "battlePoint", -1606093016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term262169, args);
    }

};


