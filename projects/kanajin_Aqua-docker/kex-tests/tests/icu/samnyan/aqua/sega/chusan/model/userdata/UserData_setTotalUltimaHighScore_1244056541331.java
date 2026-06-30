package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserData_setTotalUltimaHighScore_1244056541331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287105;
     Object term287182;

    public UserData_setTotalUltimaHighScore_1244056541331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287105 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term287105, term287105.getClass(), "id", 0L);
        setField(term287105, term287105.getClass(), "card", null);
        setField(term287105, term287105.getClass(), "userName", null);
        setIntField(term287105, term287105.getClass(), "level", 0);
        setIntField(term287105, term287105.getClass(), "reincarnationNum", 0);
        setField(term287105, term287105.getClass(), "exp", null);
        setLongField(term287105, term287105.getClass(), "point", 0L);
        setLongField(term287105, term287105.getClass(), "totalPoint", 0L);
        setIntField(term287105, term287105.getClass(), "playCount", 0);
        setIntField(term287105, term287105.getClass(), "multiPlayCount", 0);
        setIntField(term287105, term287105.getClass(), "playerRating", 0);
        setIntField(term287105, term287105.getClass(), "highestRating", 0);
        setIntField(term287105, term287105.getClass(), "nameplateId", 0);
        setIntField(term287105, term287105.getClass(), "frameId", 0);
        setIntField(term287105, term287105.getClass(), "characterId", 0);
        setIntField(term287105, term287105.getClass(), "trophyId", 0);
        setIntField(term287105, term287105.getClass(), "playedTutorialBit", 0);
        setIntField(term287105, term287105.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term287105, term287105.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term287105, term287105.getClass(), "totalMapNum", 0);
        setLongField(term287105, term287105.getClass(), "totalHiScore", 0L);
        setLongField(term287105, term287105.getClass(), "totalBasicHighScore", 0L);
        setLongField(term287105, term287105.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term287105, term287105.getClass(), "totalExpertHighScore", 0L);
        setLongField(term287105, term287105.getClass(), "totalMasterHighScore", 0L);
        setLongField(term287105, term287105.getClass(), "totalUltimaHighScore", 0L);
        setField(term287105, term287105.getClass(), "eventWatchedDate", null);
        setIntField(term287105, term287105.getClass(), "friendCount", 0);
        setField(term287105, term287105.getClass(), "firstGameId", null);
        setField(term287105, term287105.getClass(), "firstRomVersion", null);
        setField(term287105, term287105.getClass(), "firstDataVersion", null);
        setField(term287105, term287105.getClass(), "firstPlayDate", null);
        setField(term287105, term287105.getClass(), "lastGameId", null);
        setField(term287105, term287105.getClass(), "lastRomVersion", null);
        setField(term287105, term287105.getClass(), "lastDataVersion", null);
        setField(term287105, term287105.getClass(), "lastLoginDate", null);
        setField(term287105, term287105.getClass(), "lastPlayDate", null);
        setIntField(term287105, term287105.getClass(), "lastPlaceId", 0);
        setField(term287105, term287105.getClass(), "lastPlaceName", null);
        setField(term287105, term287105.getClass(), "lastRegionId", null);
        setField(term287105, term287105.getClass(), "lastRegionName", null);
        setField(term287105, term287105.getClass(), "lastAllNetId", null);
        setField(term287105, term287105.getClass(), "lastClientId", null);
        setField(term287105, term287105.getClass(), "lastCountryCode", null);
        setField(term287105, term287105.getClass(), "userNameEx", null);
        setField(term287105, term287105.getClass(), "compatibleCmVersion", null);
        setIntField(term287105, term287105.getClass(), "medal", 0);
        setIntField(term287105, term287105.getClass(), "mapIconId", 0);
        setIntField(term287105, term287105.getClass(), "voiceId", 0);
        setIntField(term287105, term287105.getClass(), "avatarWear", 0);
        setIntField(term287105, term287105.getClass(), "avatarHead", 0);
        setIntField(term287105, term287105.getClass(), "avatarFace", 0);
        setIntField(term287105, term287105.getClass(), "avatarSkin", 0);
        setIntField(term287105, term287105.getClass(), "avatarItem", 0);
        setIntField(term287105, term287105.getClass(), "avatarFront", 0);
        setIntField(term287105, term287105.getClass(), "avatarBack", 0);
        setIntField(term287105, term287105.getClass(), "classEmblemBase", 0);
        setIntField(term287105, term287105.getClass(), "classEmblemMedal", 0);
        setIntField(term287105, term287105.getClass(), "stockedGridCount", 0);
        setIntField(term287105, term287105.getClass(), "exMapLoopCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattlePlayCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattleWinCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattleLoseCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term287105, term287105.getClass(), "charaIllustId", 0);
        setIntField(term287105, term287105.getClass(), "skillId", 0);
        setIntField(term287105, term287105.getClass(), "overPowerPoint", 0);
        setIntField(term287105, term287105.getClass(), "overPowerRate", 0);
        setIntField(term287105, term287105.getClass(), "overPowerLowerRank", 0);
        setIntField(term287105, term287105.getClass(), "avatarPoint", 0);
        setIntField(term287105, term287105.getClass(), "battleRankId", 0);
        setIntField(term287105, term287105.getClass(), "battleRankPoint", 0);
        setIntField(term287105, term287105.getClass(), "eliteRankPoint", 0);
        setIntField(term287105, term287105.getClass(), "netBattle1stCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattle2ndCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattle3rdCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattle4thCount", 0);
        setIntField(term287105, term287105.getClass(), "netBattleCorrection", 0);
        setIntField(term287105, term287105.getClass(), "netBattleErrCnt", 0);
        setIntField(term287105, term287105.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term287105, term287105.getClass(), "battleRewardStatus", 0);
        setIntField(term287105, term287105.getClass(), "battleRewardIndex", 0);
        setIntField(term287105, term287105.getClass(), "battleRewardCount", 0);
        setIntField(term287105, term287105.getClass(), "ext1", 0);
        setIntField(term287105, term287105.getClass(), "ext2", 0);
        setIntField(term287105, term287105.getClass(), "ext3", 0);
        setIntField(term287105, term287105.getClass(), "ext4", 0);
        setIntField(term287105, term287105.getClass(), "ext5", 0);
        setIntField(term287105, term287105.getClass(), "ext6", 0);
        setIntField(term287105, term287105.getClass(), "ext7", 0);
        setIntField(term287105, term287105.getClass(), "ext8", 0);
        setIntField(term287105, term287105.getClass(), "ext9", 0);
        setIntField(term287105, term287105.getClass(), "ext10", 0);
        setField(term287105, term287105.getClass(), "extStr1", null);
        setField(term287105, term287105.getClass(), "extStr2", null);
        setLongField(term287105, term287105.getClass(), "extLong1", 0L);
        setLongField(term287105, term287105.getClass(), "extLong2", 0L);
        setField(term287105, term287105.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term287105, term287105.getClass(), "isNetBattleHost", false);
        setIntField(term287105, term287105.getClass(), "netBattleEndState", 0);
        term287182 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term287182;
        callMethod(klass, "setTotalUltimaHighScore", argTypes, term287105, args);
    }

};


