package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserOption_setFilterRec_208090545080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75701;
     Object term75919;

    public UserOption_setFilterRec_208090545080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75707 = new Long(6906379511067694917L);
        term75701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term75703 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term75705 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75736 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75701, term75701.getClass(), "id", -2613029888948149747L);
        setLongField(term75703, term75703.getClass(), "id", -6418282217428803693L);
        setLongField(term75705, term75705.getClass(), "id", -5608790408657117046L);
        setField(term75705, term75705.getClass(), "extId", term75707);
        setField(term75705, term75705.getClass(), "luid", "qociGUMzem");
        setIntField(term75722, term75722.getClass(), "year", 2018);
        setShortField(term75722, term75722.getClass(), "month", (short) 11);
        setShortField(term75722, term75722.getClass(), "day", (short) 14);
        setField(term75721, term75721.getClass(), "date", term75722);
        setByteField(term75726, term75726.getClass(), "hour", (byte) 18);
        setByteField(term75726, term75726.getClass(), "minute", (byte) 31);
        setByteField(term75726, term75726.getClass(), "second", (byte) 15);
        setIntField(term75726, term75726.getClass(), "nano", 39699749);
        setField(term75721, term75721.getClass(), "time", term75726);
        setField(term75705, term75705.getClass(), "registerTime", term75721);
        setIntField(term75732, term75732.getClass(), "year", 2019);
        setShortField(term75732, term75732.getClass(), "month", (short) 4);
        setShortField(term75732, term75732.getClass(), "day", (short) 21);
        setField(term75731, term75731.getClass(), "date", term75732);
        setByteField(term75736, term75736.getClass(), "hour", (byte) 12);
        setByteField(term75736, term75736.getClass(), "minute", (byte) 13);
        setByteField(term75736, term75736.getClass(), "second", (byte) 21);
        setIntField(term75736, term75736.getClass(), "nano", 906802544);
        setField(term75731, term75731.getClass(), "time", term75736);
        setField(term75705, term75705.getClass(), "accessTime", term75731);
        setField(term75703, term75703.getClass(), "card", term75705);
        setIntField(term75703, term75703.getClass(), "lastDataVersion", -120387211);
        setField(term75703, term75703.getClass(), "userName", "HHAfSjIdNi");
        setIntField(term75703, term75703.getClass(), "point", 1433123804);
        setIntField(term75703, term75703.getClass(), "totalPoint", 1303294526);
        setIntField(term75703, term75703.getClass(), "iconId", -793549641);
        setIntField(term75703, term75703.getClass(), "nameplateId", 939074715);
        setIntField(term75703, term75703.getClass(), "frameId", -2019254696);
        setIntField(term75703, term75703.getClass(), "trophyId", 116630141);
        setIntField(term75703, term75703.getClass(), "playCount", 1983958483);
        setIntField(term75703, term75703.getClass(), "playVsCount", 1537645134);
        setIntField(term75703, term75703.getClass(), "playSyncCount", -1274842802);
        setIntField(term75703, term75703.getClass(), "winCount", -1429612486);
        setIntField(term75703, term75703.getClass(), "helpCount", 1146772422);
        setIntField(term75703, term75703.getClass(), "comboCount", -1467365561);
        setIntField(term75703, term75703.getClass(), "feverCount", -239583367);
        setIntField(term75703, term75703.getClass(), "totalHiScore", -2114583072);
        setIntField(term75703, term75703.getClass(), "totalEasyHighScore", -991738527);
        setIntField(term75703, term75703.getClass(), "totalBasicHighScore", -863658575);
        setIntField(term75703, term75703.getClass(), "totalAdvancedHighScore", 944252822);
        setIntField(term75703, term75703.getClass(), "totalExpertHighScore", -767773428);
        setIntField(term75703, term75703.getClass(), "totalMasterHighScore", -802951772);
        setIntField(term75703, term75703.getClass(), "totalReMasterHighScore", 1865162800);
        setIntField(term75703, term75703.getClass(), "totalHighSync", -840346352);
        setIntField(term75703, term75703.getClass(), "totalEasySync", -622009558);
        setIntField(term75703, term75703.getClass(), "totalBasicSync", 1002040727);
        setIntField(term75703, term75703.getClass(), "totalAdvancedSync", 1043794213);
        setIntField(term75703, term75703.getClass(), "totalExpertSync", 668553213);
        setIntField(term75703, term75703.getClass(), "totalMasterSync", 845497440);
        setIntField(term75703, term75703.getClass(), "totalReMasterSync", -929142950);
        setIntField(term75703, term75703.getClass(), "playerRating", -481484241);
        setIntField(term75703, term75703.getClass(), "highestRating", 28563533);
        setIntField(term75703, term75703.getClass(), "rankAuthTailId", -353349462);
        setField(term75703, term75703.getClass(), "eventWatchedDate", "oTqQEKklHi");
        setField(term75703, term75703.getClass(), "webLimitDate", "riyKkxMvWm");
        setIntField(term75703, term75703.getClass(), "challengeTrackPhase", -573180293);
        setIntField(term75703, term75703.getClass(), "firstPlayBits", -129560588);
        setField(term75703, term75703.getClass(), "lastPlayDate", "WENnGcBSTd");
        setIntField(term75703, term75703.getClass(), "lastPlaceId", -25182144);
        setField(term75703, term75703.getClass(), "lastPlaceName", "juEYcOCxLW");
        setIntField(term75703, term75703.getClass(), "lastRegionId", -1401847995);
        setField(term75703, term75703.getClass(), "lastRegionName", "YsWgGEhEmC");
        setField(term75703, term75703.getClass(), "lastClientId", "PBcepqkBBV");
        setField(term75703, term75703.getClass(), "lastCountryCode", "mukHRKZmND");
        setIntField(term75703, term75703.getClass(), "eventPoint", -1832988281);
        setIntField(term75703, term75703.getClass(), "totalLv", -384920032);
        setIntField(term75703, term75703.getClass(), "lastLoginBonusDay", -1752532456);
        setIntField(term75703, term75703.getClass(), "lastSurvivalBonusDay", 1663063121);
        setIntField(term75703, term75703.getClass(), "loginBonusLv", -299437853);
        setField(term75701, term75701.getClass(), "user", term75703);
        setIntField(term75701, term75701.getClass(), "soudEffect", 1516214189);
        setIntField(term75701, term75701.getClass(), "mirrorMode", 2038582544);
        setIntField(term75701, term75701.getClass(), "guideSpeed", -667671375);
        setIntField(term75701, term75701.getClass(), "bgInfo", -2019733796);
        setIntField(term75701, term75701.getClass(), "brightness", 1130518373);
        setIntField(term75701, term75701.getClass(), "isStarRot", -221616756);
        setIntField(term75701, term75701.getClass(), "breakSe", 976073781);
        setIntField(term75701, term75701.getClass(), "slideSe", -1274112773);
        setIntField(term75701, term75701.getClass(), "hardJudge", 1368046757);
        setIntField(term75701, term75701.getClass(), "isTagJump", 1845703825);
        setIntField(term75701, term75701.getClass(), "breakSeVol", 1704595963);
        setIntField(term75701, term75701.getClass(), "slideSeVol", 1995360926);
        setIntField(term75701, term75701.getClass(), "isUpperDisp", 1386258530);
        setIntField(term75701, term75701.getClass(), "trackSkip", -2072718730);
        setIntField(term75701, term75701.getClass(), "optionMode", 1727813394);
        setIntField(term75701, term75701.getClass(), "simpleOptionParam", -885598013);
        setIntField(term75701, term75701.getClass(), "adjustTiming", 1821468273);
        setIntField(term75701, term75701.getClass(), "dispTiming", 1420843227);
        setIntField(term75701, term75701.getClass(), "timingPos", -649974945);
        setIntField(term75701, term75701.getClass(), "ansVol", -996804825);
        setIntField(term75701, term75701.getClass(), "noteVol", -1913952510);
        setIntField(term75701, term75701.getClass(), "dmgVol", 93874138);
        setIntField(term75701, term75701.getClass(), "appealFlame", 1006712004);
        setIntField(term75701, term75701.getClass(), "isFeverDisp", 648304271);
        setIntField(term75701, term75701.getClass(), "dispJudge", 820505709);
        setIntField(term75701, term75701.getClass(), "judgePos", -1269806468);
        setIntField(term75701, term75701.getClass(), "ratingGuard", 1341772926);
        setIntField(term75701, term75701.getClass(), "selectChara", -1897554844);
        setIntField(term75701, term75701.getClass(), "sortType", -1108293327);
        setIntField(term75701, term75701.getClass(), "filterGenre", 798256751);
        setIntField(term75701, term75701.getClass(), "filterLevel", -918694194);
        setIntField(term75701, term75701.getClass(), "filterRank", 876544901);
        setIntField(term75701, term75701.getClass(), "filterVersion", 1306184248);
        setIntField(term75701, term75701.getClass(), "filterRec", 2079728373);
        setIntField(term75701, term75701.getClass(), "filterFullCombo", -350226213);
        setIntField(term75701, term75701.getClass(), "filterAllPerfect", -1536281000);
        setIntField(term75701, term75701.getClass(), "filterDifficulty", 2145290591);
        setIntField(term75701, term75701.getClass(), "filterFullSync", 94360350);
        setIntField(term75701, term75701.getClass(), "filterReMaster", -990156586);
        setIntField(term75701, term75701.getClass(), "filterMaxFever", 994784802);
        setIntField(term75701, term75701.getClass(), "finalSelectId", -1880267722);
        setIntField(term75701, term75701.getClass(), "finalSelectCategory", -320458952);
        term75919 = new Integer(103851103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75919;
        callMethod(klass, "setFilterRec", argTypes, term75701, args);
    }

};


