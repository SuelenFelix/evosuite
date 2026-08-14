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

public class UserData_getNetBattleErrCnt_225931964285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4218043;

    public UserData_getNetBattleErrCnt_225931964285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4218043 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4218043, term4218043.getClass(), "id", 0L);
        setField(term4218043, term4218043.getClass(), "card", null);
        setField(term4218043, term4218043.getClass(), "userName", null);
        setIntField(term4218043, term4218043.getClass(), "level", 0);
        setIntField(term4218043, term4218043.getClass(), "reincarnationNum", 0);
        setField(term4218043, term4218043.getClass(), "exp", null);
        setLongField(term4218043, term4218043.getClass(), "point", 0L);
        setLongField(term4218043, term4218043.getClass(), "totalPoint", 0L);
        setIntField(term4218043, term4218043.getClass(), "playCount", 0);
        setIntField(term4218043, term4218043.getClass(), "multiPlayCount", 0);
        setIntField(term4218043, term4218043.getClass(), "playerRating", 0);
        setIntField(term4218043, term4218043.getClass(), "highestRating", 0);
        setIntField(term4218043, term4218043.getClass(), "nameplateId", 0);
        setIntField(term4218043, term4218043.getClass(), "frameId", 0);
        setIntField(term4218043, term4218043.getClass(), "characterId", 0);
        setIntField(term4218043, term4218043.getClass(), "trophyId", 0);
        setIntField(term4218043, term4218043.getClass(), "playedTutorialBit", 0);
        setIntField(term4218043, term4218043.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4218043, term4218043.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4218043, term4218043.getClass(), "totalMapNum", 0);
        setLongField(term4218043, term4218043.getClass(), "totalHiScore", 0L);
        setLongField(term4218043, term4218043.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4218043, term4218043.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4218043, term4218043.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4218043, term4218043.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4218043, term4218043.getClass(), "totalUltimaHighScore", 0L);
        setField(term4218043, term4218043.getClass(), "eventWatchedDate", null);
        setIntField(term4218043, term4218043.getClass(), "friendCount", 0);
        setField(term4218043, term4218043.getClass(), "firstGameId", null);
        setField(term4218043, term4218043.getClass(), "firstRomVersion", null);
        setField(term4218043, term4218043.getClass(), "firstDataVersion", null);
        setField(term4218043, term4218043.getClass(), "firstPlayDate", null);
        setField(term4218043, term4218043.getClass(), "lastGameId", null);
        setField(term4218043, term4218043.getClass(), "lastRomVersion", null);
        setField(term4218043, term4218043.getClass(), "lastDataVersion", null);
        setField(term4218043, term4218043.getClass(), "lastLoginDate", null);
        setField(term4218043, term4218043.getClass(), "lastPlayDate", null);
        setIntField(term4218043, term4218043.getClass(), "lastPlaceId", 0);
        setField(term4218043, term4218043.getClass(), "lastPlaceName", null);
        setField(term4218043, term4218043.getClass(), "lastRegionId", null);
        setField(term4218043, term4218043.getClass(), "lastRegionName", null);
        setField(term4218043, term4218043.getClass(), "lastAllNetId", null);
        setField(term4218043, term4218043.getClass(), "lastClientId", null);
        setField(term4218043, term4218043.getClass(), "lastCountryCode", null);
        setField(term4218043, term4218043.getClass(), "userNameEx", null);
        setField(term4218043, term4218043.getClass(), "compatibleCmVersion", null);
        setIntField(term4218043, term4218043.getClass(), "medal", 0);
        setIntField(term4218043, term4218043.getClass(), "mapIconId", 0);
        setIntField(term4218043, term4218043.getClass(), "voiceId", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarWear", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarHead", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarFace", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarSkin", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarItem", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarFront", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarBack", 0);
        setIntField(term4218043, term4218043.getClass(), "classEmblemBase", 0);
        setIntField(term4218043, term4218043.getClass(), "classEmblemMedal", 0);
        setIntField(term4218043, term4218043.getClass(), "stockedGridCount", 0);
        setIntField(term4218043, term4218043.getClass(), "exMapLoopCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattlePlayCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattleWinCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattleLoseCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4218043, term4218043.getClass(), "charaIllustId", 0);
        setIntField(term4218043, term4218043.getClass(), "skillId", 0);
        setIntField(term4218043, term4218043.getClass(), "overPowerPoint", 0);
        setIntField(term4218043, term4218043.getClass(), "overPowerRate", 0);
        setIntField(term4218043, term4218043.getClass(), "overPowerLowerRank", 0);
        setIntField(term4218043, term4218043.getClass(), "avatarPoint", 0);
        setIntField(term4218043, term4218043.getClass(), "battleRankId", 0);
        setIntField(term4218043, term4218043.getClass(), "battleRankPoint", 0);
        setIntField(term4218043, term4218043.getClass(), "eliteRankPoint", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattle1stCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattle2ndCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattle3rdCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattle4thCount", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattleCorrection", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattleErrCnt", 0);
        setIntField(term4218043, term4218043.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4218043, term4218043.getClass(), "battleRewardStatus", 0);
        setIntField(term4218043, term4218043.getClass(), "battleRewardIndex", 0);
        setIntField(term4218043, term4218043.getClass(), "battleRewardCount", 0);
        setIntField(term4218043, term4218043.getClass(), "ext1", 0);
        setIntField(term4218043, term4218043.getClass(), "ext2", 0);
        setIntField(term4218043, term4218043.getClass(), "ext3", 0);
        setIntField(term4218043, term4218043.getClass(), "ext4", 0);
        setIntField(term4218043, term4218043.getClass(), "ext5", 0);
        setIntField(term4218043, term4218043.getClass(), "ext6", 0);
        setIntField(term4218043, term4218043.getClass(), "ext7", 0);
        setIntField(term4218043, term4218043.getClass(), "ext8", 0);
        setIntField(term4218043, term4218043.getClass(), "ext9", 0);
        setIntField(term4218043, term4218043.getClass(), "ext10", 0);
        setField(term4218043, term4218043.getClass(), "extStr1", null);
        setField(term4218043, term4218043.getClass(), "extStr2", null);
        setLongField(term4218043, term4218043.getClass(), "extLong1", 0L);
        setLongField(term4218043, term4218043.getClass(), "extLong2", 0L);
        setField(term4218043, term4218043.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4218043, term4218043.getClass(), "isNetBattleHost", false);
        setIntField(term4218043, term4218043.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattleErrCnt", argTypes, term4218043, args);
    }

};


