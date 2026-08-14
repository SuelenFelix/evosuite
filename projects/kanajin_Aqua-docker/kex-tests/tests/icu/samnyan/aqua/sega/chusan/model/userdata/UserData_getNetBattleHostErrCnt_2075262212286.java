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

public class UserData_getNetBattleHostErrCnt_2075262212286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4218120;

    public UserData_getNetBattleHostErrCnt_2075262212286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4218120 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4218120, term4218120.getClass(), "id", 0L);
        setField(term4218120, term4218120.getClass(), "card", null);
        setField(term4218120, term4218120.getClass(), "userName", null);
        setIntField(term4218120, term4218120.getClass(), "level", 0);
        setIntField(term4218120, term4218120.getClass(), "reincarnationNum", 0);
        setField(term4218120, term4218120.getClass(), "exp", null);
        setLongField(term4218120, term4218120.getClass(), "point", 0L);
        setLongField(term4218120, term4218120.getClass(), "totalPoint", 0L);
        setIntField(term4218120, term4218120.getClass(), "playCount", 0);
        setIntField(term4218120, term4218120.getClass(), "multiPlayCount", 0);
        setIntField(term4218120, term4218120.getClass(), "playerRating", 0);
        setIntField(term4218120, term4218120.getClass(), "highestRating", 0);
        setIntField(term4218120, term4218120.getClass(), "nameplateId", 0);
        setIntField(term4218120, term4218120.getClass(), "frameId", 0);
        setIntField(term4218120, term4218120.getClass(), "characterId", 0);
        setIntField(term4218120, term4218120.getClass(), "trophyId", 0);
        setIntField(term4218120, term4218120.getClass(), "playedTutorialBit", 0);
        setIntField(term4218120, term4218120.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4218120, term4218120.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4218120, term4218120.getClass(), "totalMapNum", 0);
        setLongField(term4218120, term4218120.getClass(), "totalHiScore", 0L);
        setLongField(term4218120, term4218120.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4218120, term4218120.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4218120, term4218120.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4218120, term4218120.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4218120, term4218120.getClass(), "totalUltimaHighScore", 0L);
        setField(term4218120, term4218120.getClass(), "eventWatchedDate", null);
        setIntField(term4218120, term4218120.getClass(), "friendCount", 0);
        setField(term4218120, term4218120.getClass(), "firstGameId", null);
        setField(term4218120, term4218120.getClass(), "firstRomVersion", null);
        setField(term4218120, term4218120.getClass(), "firstDataVersion", null);
        setField(term4218120, term4218120.getClass(), "firstPlayDate", null);
        setField(term4218120, term4218120.getClass(), "lastGameId", null);
        setField(term4218120, term4218120.getClass(), "lastRomVersion", null);
        setField(term4218120, term4218120.getClass(), "lastDataVersion", null);
        setField(term4218120, term4218120.getClass(), "lastLoginDate", null);
        setField(term4218120, term4218120.getClass(), "lastPlayDate", null);
        setIntField(term4218120, term4218120.getClass(), "lastPlaceId", 0);
        setField(term4218120, term4218120.getClass(), "lastPlaceName", null);
        setField(term4218120, term4218120.getClass(), "lastRegionId", null);
        setField(term4218120, term4218120.getClass(), "lastRegionName", null);
        setField(term4218120, term4218120.getClass(), "lastAllNetId", null);
        setField(term4218120, term4218120.getClass(), "lastClientId", null);
        setField(term4218120, term4218120.getClass(), "lastCountryCode", null);
        setField(term4218120, term4218120.getClass(), "userNameEx", null);
        setField(term4218120, term4218120.getClass(), "compatibleCmVersion", null);
        setIntField(term4218120, term4218120.getClass(), "medal", 0);
        setIntField(term4218120, term4218120.getClass(), "mapIconId", 0);
        setIntField(term4218120, term4218120.getClass(), "voiceId", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarWear", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarHead", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarFace", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarSkin", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarItem", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarFront", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarBack", 0);
        setIntField(term4218120, term4218120.getClass(), "classEmblemBase", 0);
        setIntField(term4218120, term4218120.getClass(), "classEmblemMedal", 0);
        setIntField(term4218120, term4218120.getClass(), "stockedGridCount", 0);
        setIntField(term4218120, term4218120.getClass(), "exMapLoopCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattlePlayCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattleWinCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattleLoseCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4218120, term4218120.getClass(), "charaIllustId", 0);
        setIntField(term4218120, term4218120.getClass(), "skillId", 0);
        setIntField(term4218120, term4218120.getClass(), "overPowerPoint", 0);
        setIntField(term4218120, term4218120.getClass(), "overPowerRate", 0);
        setIntField(term4218120, term4218120.getClass(), "overPowerLowerRank", 0);
        setIntField(term4218120, term4218120.getClass(), "avatarPoint", 0);
        setIntField(term4218120, term4218120.getClass(), "battleRankId", 0);
        setIntField(term4218120, term4218120.getClass(), "battleRankPoint", 0);
        setIntField(term4218120, term4218120.getClass(), "eliteRankPoint", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattle1stCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattle2ndCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattle3rdCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattle4thCount", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattleCorrection", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattleErrCnt", 0);
        setIntField(term4218120, term4218120.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4218120, term4218120.getClass(), "battleRewardStatus", 0);
        setIntField(term4218120, term4218120.getClass(), "battleRewardIndex", 0);
        setIntField(term4218120, term4218120.getClass(), "battleRewardCount", 0);
        setIntField(term4218120, term4218120.getClass(), "ext1", 0);
        setIntField(term4218120, term4218120.getClass(), "ext2", 0);
        setIntField(term4218120, term4218120.getClass(), "ext3", 0);
        setIntField(term4218120, term4218120.getClass(), "ext4", 0);
        setIntField(term4218120, term4218120.getClass(), "ext5", 0);
        setIntField(term4218120, term4218120.getClass(), "ext6", 0);
        setIntField(term4218120, term4218120.getClass(), "ext7", 0);
        setIntField(term4218120, term4218120.getClass(), "ext8", 0);
        setIntField(term4218120, term4218120.getClass(), "ext9", 0);
        setIntField(term4218120, term4218120.getClass(), "ext10", 0);
        setField(term4218120, term4218120.getClass(), "extStr1", null);
        setField(term4218120, term4218120.getClass(), "extStr2", null);
        setLongField(term4218120, term4218120.getClass(), "extLong1", 0L);
        setLongField(term4218120, term4218120.getClass(), "extLong2", 0L);
        setField(term4218120, term4218120.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4218120, term4218120.getClass(), "isNetBattleHost", false);
        setIntField(term4218120, term4218120.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattleHostErrCnt", argTypes, term4218120, args);
    }

};


