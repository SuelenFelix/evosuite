package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserExtend_hashCode_189197271035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163408;

    public UserExtend_hashCode_189197271035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163414 = new Long(3423965054378869855L);
        Integer term163477 = new Integer(-2114135536);
        Integer term163479 = new Integer(-1934156754);
        Integer term163481 = new Integer(-2122545415);
        Integer term163483 = new Integer(45477597);
        Integer term163485 = new Integer(702851889);
        ArrayList term163475 = new ArrayList();
        ((ArrayList) term163475).add(term163477);
        ((ArrayList) term163475).add(term163479);
        ((ArrayList) term163475).add(term163481);
        ((ArrayList) term163475).add(term163483);
        ((ArrayList) term163475).add(term163485);
        Integer term163491 = new Integer(2035373298);
        Integer term163493 = new Integer(1328311779);
        ArrayList term163489 = new ArrayList();
        ((ArrayList) term163489).add(term163491);
        ((ArrayList) term163489).add(term163493);
        Integer term163777 = new Integer(-1459351662);
        Integer term163779 = new Integer(-887392605);
        ArrayList term163775 = new ArrayList();
        ((ArrayList) term163775).add(term163777);
        ((ArrayList) term163775).add(term163779);
        ArrayList term163783 = new ArrayList();
        term163408 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term163410 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term163412 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163433 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163443 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163408, term163408.getClass(), "id", -4542614386172304387L);
        setLongField(term163410, term163410.getClass(), "id", 8945111617494109011L);
        setLongField(term163412, term163412.getClass(), "id", 202493038499333325L);
        setField(term163412, term163412.getClass(), "extId", term163414);
        setField(term163412, term163412.getClass(), "luid", "EEEzvJXKOf");
        setIntField(term163429, term163429.getClass(), "year", 2013);
        setShortField(term163429, term163429.getClass(), "month", (short) 1);
        setShortField(term163429, term163429.getClass(), "day", (short) 25);
        setField(term163428, term163428.getClass(), "date", term163429);
        setByteField(term163433, term163433.getClass(), "hour", (byte) 11);
        setByteField(term163433, term163433.getClass(), "minute", (byte) 5);
        setByteField(term163433, term163433.getClass(), "second", (byte) 35);
        setIntField(term163433, term163433.getClass(), "nano", 914812579);
        setField(term163428, term163428.getClass(), "time", term163433);
        setField(term163412, term163412.getClass(), "registerTime", term163428);
        setIntField(term163439, term163439.getClass(), "year", 2020);
        setShortField(term163439, term163439.getClass(), "month", (short) 11);
        setShortField(term163439, term163439.getClass(), "day", (short) 6);
        setField(term163438, term163438.getClass(), "date", term163439);
        setByteField(term163443, term163443.getClass(), "hour", (byte) 20);
        setByteField(term163443, term163443.getClass(), "minute", (byte) 26);
        setByteField(term163443, term163443.getClass(), "second", (byte) 26);
        setIntField(term163443, term163443.getClass(), "nano", 961202696);
        setField(term163438, term163438.getClass(), "time", term163443);
        setField(term163412, term163412.getClass(), "accessTime", term163438);
        setField(term163410, term163410.getClass(), "card", term163412);
        setField(term163410, term163410.getClass(), "userName", "ruYuUKeyoL");
        setIntField(term163410, term163410.getClass(), "isNetMember", -438744694);
        setIntField(term163410, term163410.getClass(), "iconId", 510826397);
        setIntField(term163410, term163410.getClass(), "plateId", -1227312153);
        setIntField(term163410, term163410.getClass(), "titleId", -983748653);
        setIntField(term163410, term163410.getClass(), "partnerId", 69606628);
        setIntField(term163410, term163410.getClass(), "frameId", 1551247631);
        setIntField(term163410, term163410.getClass(), "selectMapId", -650586371);
        setIntField(term163410, term163410.getClass(), "totalAwake", -1350906164);
        setIntField(term163410, term163410.getClass(), "gradeRating", 444731205);
        setIntField(term163410, term163410.getClass(), "musicRating", -1140021781);
        setIntField(term163410, term163410.getClass(), "playerRating", 752670193);
        setIntField(term163410, term163410.getClass(), "highestRating", -1881269322);
        setIntField(term163410, term163410.getClass(), "gradeRank", -1156353639);
        setIntField(term163410, term163410.getClass(), "classRank", -2123849351);
        setIntField(term163410, term163410.getClass(), "courseRank", -680880020);
        setField(term163410, term163410.getClass(), "charaSlot", term163475);
        setField(term163410, term163410.getClass(), "charaLockSlot", term163489);
        setLongField(term163410, term163410.getClass(), "contentBit", 6342509951155248187L);
        setIntField(term163410, term163410.getClass(), "playCount", -1038233622);
        setField(term163410, term163410.getClass(), "eventWatchedDate", "qZySZAtlWw");
        setField(term163410, term163410.getClass(), "lastGameId", "XDftcuEVIB");
        setField(term163410, term163410.getClass(), "lastRomVersion", "icQsCgiPfd");
        setField(term163410, term163410.getClass(), "lastDataVersion", "PVyTkZKjNq");
        setField(term163410, term163410.getClass(), "lastLoginDate", "RNUULrdSpr");
        setField(term163410, term163410.getClass(), "lastPlayDate", "OBtSUjwRLK");
        setIntField(term163410, term163410.getClass(), "lastPlayCredit", -1376494298);
        setIntField(term163410, term163410.getClass(), "lastPlayMode", 641536751);
        setIntField(term163410, term163410.getClass(), "lastPlaceId", 1009826201);
        setField(term163410, term163410.getClass(), "lastPlaceName", "QbLHBJXaMu");
        setIntField(term163410, term163410.getClass(), "lastAllNetId", -514267762);
        setIntField(term163410, term163410.getClass(), "lastRegionId", -351553807);
        setField(term163410, term163410.getClass(), "lastRegionName", "OYMmpMJVgl");
        setField(term163410, term163410.getClass(), "lastClientId", "auhFemTfIs");
        setField(term163410, term163410.getClass(), "lastCountryCode", "IhxGrgSVtO");
        setIntField(term163410, term163410.getClass(), "lastSelectEMoney", -1939890429);
        setIntField(term163410, term163410.getClass(), "lastSelectTicket", -2050304978);
        setIntField(term163410, term163410.getClass(), "lastSelectCourse", -1960407729);
        setIntField(term163410, term163410.getClass(), "lastCountCourse", -890731167);
        setField(term163410, term163410.getClass(), "firstGameId", "SoHyyXooNj");
        setField(term163410, term163410.getClass(), "firstRomVersion", "ewsxMpzQJL");
        setField(term163410, term163410.getClass(), "firstDataVersion", "ckvWshDuZV");
        setField(term163410, term163410.getClass(), "firstPlayDate", "WsZSiTmUAb");
        setField(term163410, term163410.getClass(), "compatibleCmVersion", "unlHlivihq");
        setField(term163410, term163410.getClass(), "dailyBonusDate", "SpWXYUYOyr");
        setField(term163410, term163410.getClass(), "dailyCourseBonusDate", "HEFcNDOCWd");
        setField(term163410, term163410.getClass(), "lastPairLoginDate", "uGtmSuLIbe");
        setField(term163410, term163410.getClass(), "lastTrialPlayDate", "jXprxniQLh");
        setIntField(term163410, term163410.getClass(), "playVsCount", 88958658);
        setIntField(term163410, term163410.getClass(), "playSyncCount", -1360000339);
        setIntField(term163410, term163410.getClass(), "winCount", 1151552333);
        setIntField(term163410, term163410.getClass(), "helpCount", -1639285726);
        setIntField(term163410, term163410.getClass(), "comboCount", 858615712);
        setLongField(term163410, term163410.getClass(), "totalDeluxscore", 3411042195807403878L);
        setLongField(term163410, term163410.getClass(), "totalBasicDeluxscore", 2201602253869610768L);
        setLongField(term163410, term163410.getClass(), "totalAdvancedDeluxscore", -2820584216575941815L);
        setLongField(term163410, term163410.getClass(), "totalExpertDeluxscore", 2397718102151609853L);
        setLongField(term163410, term163410.getClass(), "totalMasterDeluxscore", 3645580588979496158L);
        setLongField(term163410, term163410.getClass(), "totalReMasterDeluxscore", 4506144800298677277L);
        setIntField(term163410, term163410.getClass(), "totalSync", -999600154);
        setIntField(term163410, term163410.getClass(), "totalBasicSync", -201429161);
        setIntField(term163410, term163410.getClass(), "totalAdvancedSync", 1900864076);
        setIntField(term163410, term163410.getClass(), "totalExpertSync", 235469007);
        setIntField(term163410, term163410.getClass(), "totalMasterSync", 1009857473);
        setIntField(term163410, term163410.getClass(), "totalReMasterSync", 1198152792);
        setLongField(term163410, term163410.getClass(), "totalAchievement", 2950768168445402516L);
        setLongField(term163410, term163410.getClass(), "totalBasicAchievement", -1883703292057603007L);
        setLongField(term163410, term163410.getClass(), "totalAdvancedAchievement", -7757343143113790900L);
        setLongField(term163410, term163410.getClass(), "totalExpertAchievement", 7140439527813222384L);
        setLongField(term163410, term163410.getClass(), "totalMasterAchievement", -2922062958064432137L);
        setLongField(term163410, term163410.getClass(), "totalReMasterAchievement", -8800999826532869458L);
        setLongField(term163410, term163410.getClass(), "playerOldRating", 4824667538051001981L);
        setLongField(term163410, term163410.getClass(), "playerNewRating", 5874341572546274689L);
        setIntField(term163410, term163410.getClass(), "banState", 920073923);
        setLongField(term163410, term163410.getClass(), "dateTime", -6377486251340711456L);
        setField(term163408, term163408.getClass(), "user", term163410);
        setIntField(term163408, term163408.getClass(), "selectMusicId", -626830892);
        setIntField(term163408, term163408.getClass(), "selectDifficultyId", 578762810);
        setIntField(term163408, term163408.getClass(), "categoryIndex", -377138416);
        setIntField(term163408, term163408.getClass(), "musicIndex", 893990624);
        setIntField(term163408, term163408.getClass(), "extraFlag", 1423967830);
        setIntField(term163408, term163408.getClass(), "selectScoreType", 841806507);
        setLongField(term163408, term163408.getClass(), "extendContentBit", 2518058547438022320L);
        setBooleanField(term163408, term163408.getClass(), "isPhotoAgree", false);
        setBooleanField(term163408, term163408.getClass(), "isGotoCodeRead", false);
        setBooleanField(term163408, term163408.getClass(), "selectResultDetails", true);
        setIntField(term163408, term163408.getClass(), "sortCategorySetting", 1652012038);
        setIntField(term163408, term163408.getClass(), "sortMusicSetting", 1955474256);
        setField(term163408, term163408.getClass(), "selectedCardList", term163775);
        setField(term163408, term163408.getClass(), "encountMapNpcList", term163783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term163408, args);
    }

};


