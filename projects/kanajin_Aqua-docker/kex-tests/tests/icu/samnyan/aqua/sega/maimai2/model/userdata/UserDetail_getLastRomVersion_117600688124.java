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

public class UserDetail_getLastRomVersion_117600688124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4243126;

    public UserDetail_getLastRomVersion_117600688124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4243130 = new Long(92093736088761491L);
        Integer term4243193 = new Integer(630074094);
        Integer term4243195 = new Integer(570208042);
        Integer term4243197 = new Integer(-93488030);
        Integer term4243199 = new Integer(926138799);
        Integer term4243201 = new Integer(591313019);
        Integer term4243203 = new Integer(-1755672438);
        Integer term4243205 = new Integer(-2140257584);
        Integer term4243207 = new Integer(-1626490850);
        ArrayList term4243191 = new ArrayList();
        ((ArrayList) term4243191).add(term4243193);
        ((ArrayList) term4243191).add(term4243195);
        ((ArrayList) term4243191).add(term4243197);
        ((ArrayList) term4243191).add(term4243199);
        ((ArrayList) term4243191).add(term4243201);
        ((ArrayList) term4243191).add(term4243203);
        ((ArrayList) term4243191).add(term4243205);
        ((ArrayList) term4243191).add(term4243207);
        Integer term4243213 = new Integer(446978027);
        Integer term4243215 = new Integer(-384315341);
        Integer term4243217 = new Integer(204740619);
        Integer term4243219 = new Integer(107555188);
        ArrayList term4243211 = new ArrayList();
        ((ArrayList) term4243211).add(term4243213);
        ((ArrayList) term4243211).add(term4243215);
        ((ArrayList) term4243211).add(term4243217);
        ((ArrayList) term4243211).add(term4243219);
        term4243126 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4243128 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4243144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4243145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4243149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4243154 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4243155 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4243159 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4243126, term4243126.getClass(), "id", -3192557491259341882L);
        setLongField(term4243128, term4243128.getClass(), "id", 5944299577203983831L);
        setField(term4243128, term4243128.getClass(), "extId", term4243130);
        setField(term4243128, term4243128.getClass(), "luid", "zUfSbcSMQZ");
        setIntField(term4243145, term4243145.getClass(), "year", 2023);
        setShortField(term4243145, term4243145.getClass(), "month", (short) 9);
        setShortField(term4243145, term4243145.getClass(), "day", (short) 14);
        setField(term4243144, term4243144.getClass(), "date", term4243145);
        setByteField(term4243149, term4243149.getClass(), "hour", (byte) 6);
        setByteField(term4243149, term4243149.getClass(), "minute", (byte) 7);
        setByteField(term4243149, term4243149.getClass(), "second", (byte) 30);
        setIntField(term4243149, term4243149.getClass(), "nano", 420638836);
        setField(term4243144, term4243144.getClass(), "time", term4243149);
        setField(term4243128, term4243128.getClass(), "registerTime", term4243144);
        setIntField(term4243155, term4243155.getClass(), "year", 2022);
        setShortField(term4243155, term4243155.getClass(), "month", (short) 11);
        setShortField(term4243155, term4243155.getClass(), "day", (short) 9);
        setField(term4243154, term4243154.getClass(), "date", term4243155);
        setByteField(term4243159, term4243159.getClass(), "hour", (byte) 2);
        setByteField(term4243159, term4243159.getClass(), "minute", (byte) 27);
        setByteField(term4243159, term4243159.getClass(), "second", (byte) 23);
        setIntField(term4243159, term4243159.getClass(), "nano", 705178109);
        setField(term4243154, term4243154.getClass(), "time", term4243159);
        setField(term4243128, term4243128.getClass(), "accessTime", term4243154);
        setField(term4243126, term4243126.getClass(), "card", term4243128);
        setField(term4243126, term4243126.getClass(), "userName", "JyHLdZobRK");
        setIntField(term4243126, term4243126.getClass(), "isNetMember", 2006421467);
        setIntField(term4243126, term4243126.getClass(), "iconId", -583395586);
        setIntField(term4243126, term4243126.getClass(), "plateId", -1847725509);
        setIntField(term4243126, term4243126.getClass(), "titleId", 748141060);
        setIntField(term4243126, term4243126.getClass(), "partnerId", 1135111887);
        setIntField(term4243126, term4243126.getClass(), "frameId", -854516665);
        setIntField(term4243126, term4243126.getClass(), "selectMapId", 2007766256);
        setIntField(term4243126, term4243126.getClass(), "totalAwake", -387466107);
        setIntField(term4243126, term4243126.getClass(), "gradeRating", 311105729);
        setIntField(term4243126, term4243126.getClass(), "musicRating", 1671213037);
        setIntField(term4243126, term4243126.getClass(), "playerRating", 221329339);
        setIntField(term4243126, term4243126.getClass(), "highestRating", 1582149643);
        setIntField(term4243126, term4243126.getClass(), "gradeRank", -1537062156);
        setIntField(term4243126, term4243126.getClass(), "classRank", 1668745700);
        setIntField(term4243126, term4243126.getClass(), "courseRank", 201795475);
        setField(term4243126, term4243126.getClass(), "charaSlot", term4243191);
        setField(term4243126, term4243126.getClass(), "charaLockSlot", term4243211);
        setLongField(term4243126, term4243126.getClass(), "contentBit", 4319731246392995125L);
        setIntField(term4243126, term4243126.getClass(), "playCount", 1086433921);
        setField(term4243126, term4243126.getClass(), "eventWatchedDate", "UfZFlYEJsa");
        setField(term4243126, term4243126.getClass(), "lastGameId", "VEhOujcdiy");
        setField(term4243126, term4243126.getClass(), "lastRomVersion", "bPiEtYboxS");
        setField(term4243126, term4243126.getClass(), "lastDataVersion", "KtgZYFJcFq");
        setField(term4243126, term4243126.getClass(), "lastLoginDate", "zItbuYzRur");
        setField(term4243126, term4243126.getClass(), "lastPlayDate", "ShmndtVPeQ");
        setIntField(term4243126, term4243126.getClass(), "lastPlayCredit", -1107941360);
        setIntField(term4243126, term4243126.getClass(), "lastPlayMode", 214946426);
        setIntField(term4243126, term4243126.getClass(), "lastPlaceId", -1519641288);
        setField(term4243126, term4243126.getClass(), "lastPlaceName", "fUCPWRNaUp");
        setIntField(term4243126, term4243126.getClass(), "lastAllNetId", -1377687223);
        setIntField(term4243126, term4243126.getClass(), "lastRegionId", -1404238846);
        setField(term4243126, term4243126.getClass(), "lastRegionName", "qphKrHvLAt");
        setField(term4243126, term4243126.getClass(), "lastClientId", "mflARltFLt");
        setField(term4243126, term4243126.getClass(), "lastCountryCode", "lKvJeylxwX");
        setIntField(term4243126, term4243126.getClass(), "lastSelectEMoney", 450480739);
        setIntField(term4243126, term4243126.getClass(), "lastSelectTicket", 962938300);
        setIntField(term4243126, term4243126.getClass(), "lastSelectCourse", 2130626927);
        setIntField(term4243126, term4243126.getClass(), "lastCountCourse", -1129674209);
        setField(term4243126, term4243126.getClass(), "firstGameId", "IpgIRcYtKy");
        setField(term4243126, term4243126.getClass(), "firstRomVersion", "bPoIAFQkUN");
        setField(term4243126, term4243126.getClass(), "firstDataVersion", "MhNEvwIQOc");
        setField(term4243126, term4243126.getClass(), "firstPlayDate", "MVzZxAoDwB");
        setField(term4243126, term4243126.getClass(), "compatibleCmVersion", "EfmbCqqQje");
        setField(term4243126, term4243126.getClass(), "dailyBonusDate", "FTfLpOQeGf");
        setField(term4243126, term4243126.getClass(), "dailyCourseBonusDate", "XjGProHZMW");
        setField(term4243126, term4243126.getClass(), "lastPairLoginDate", "mGZgfpXWAm");
        setField(term4243126, term4243126.getClass(), "lastTrialPlayDate", "qRlwFkaPFE");
        setIntField(term4243126, term4243126.getClass(), "playVsCount", 2028101650);
        setIntField(term4243126, term4243126.getClass(), "playSyncCount", 593678148);
        setIntField(term4243126, term4243126.getClass(), "winCount", -1961242847);
        setIntField(term4243126, term4243126.getClass(), "helpCount", 769171855);
        setIntField(term4243126, term4243126.getClass(), "comboCount", -1078147511);
        setLongField(term4243126, term4243126.getClass(), "totalDeluxscore", -1014955816176557077L);
        setLongField(term4243126, term4243126.getClass(), "totalBasicDeluxscore", 114434744594592445L);
        setLongField(term4243126, term4243126.getClass(), "totalAdvancedDeluxscore", -5097878404766477541L);
        setLongField(term4243126, term4243126.getClass(), "totalExpertDeluxscore", 6498329262650746537L);
        setLongField(term4243126, term4243126.getClass(), "totalMasterDeluxscore", 6930118849665537162L);
        setLongField(term4243126, term4243126.getClass(), "totalReMasterDeluxscore", 1014952307966569679L);
        setIntField(term4243126, term4243126.getClass(), "totalSync", 2140241423);
        setIntField(term4243126, term4243126.getClass(), "totalBasicSync", -835309474);
        setIntField(term4243126, term4243126.getClass(), "totalAdvancedSync", -1068056);
        setIntField(term4243126, term4243126.getClass(), "totalExpertSync", -189833229);
        setIntField(term4243126, term4243126.getClass(), "totalMasterSync", 71437751);
        setIntField(term4243126, term4243126.getClass(), "totalReMasterSync", 2121209582);
        setLongField(term4243126, term4243126.getClass(), "totalAchievement", 6813965661936037056L);
        setLongField(term4243126, term4243126.getClass(), "totalBasicAchievement", 6755407794385068753L);
        setLongField(term4243126, term4243126.getClass(), "totalAdvancedAchievement", -4731760116973269111L);
        setLongField(term4243126, term4243126.getClass(), "totalExpertAchievement", -5934938728172746592L);
        setLongField(term4243126, term4243126.getClass(), "totalMasterAchievement", -4220884925831666147L);
        setLongField(term4243126, term4243126.getClass(), "totalReMasterAchievement", -4968213886671033023L);
        setLongField(term4243126, term4243126.getClass(), "playerOldRating", 2410147146497430400L);
        setLongField(term4243126, term4243126.getClass(), "playerNewRating", 8717128404424745939L);
        setIntField(term4243126, term4243126.getClass(), "banState", 1930050073);
        setLongField(term4243126, term4243126.getClass(), "dateTime", 3440378727486380843L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term4243126, args);
    }

};


