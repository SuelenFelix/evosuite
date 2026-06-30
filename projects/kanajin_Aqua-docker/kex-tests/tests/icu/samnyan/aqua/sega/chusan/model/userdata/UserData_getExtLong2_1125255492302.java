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

public class UserData_getExtLong2_1125255492302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284828;

    public UserData_getExtLong2_1125255492302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284828 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term284828, term284828.getClass(), "id", 0L);
        setField(term284828, term284828.getClass(), "card", null);
        setField(term284828, term284828.getClass(), "userName", null);
        setIntField(term284828, term284828.getClass(), "level", 0);
        setIntField(term284828, term284828.getClass(), "reincarnationNum", 0);
        setField(term284828, term284828.getClass(), "exp", null);
        setLongField(term284828, term284828.getClass(), "point", 0L);
        setLongField(term284828, term284828.getClass(), "totalPoint", 0L);
        setIntField(term284828, term284828.getClass(), "playCount", 0);
        setIntField(term284828, term284828.getClass(), "multiPlayCount", 0);
        setIntField(term284828, term284828.getClass(), "playerRating", 0);
        setIntField(term284828, term284828.getClass(), "highestRating", 0);
        setIntField(term284828, term284828.getClass(), "nameplateId", 0);
        setIntField(term284828, term284828.getClass(), "frameId", 0);
        setIntField(term284828, term284828.getClass(), "characterId", 0);
        setIntField(term284828, term284828.getClass(), "trophyId", 0);
        setIntField(term284828, term284828.getClass(), "playedTutorialBit", 0);
        setIntField(term284828, term284828.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term284828, term284828.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term284828, term284828.getClass(), "totalMapNum", 0);
        setLongField(term284828, term284828.getClass(), "totalHiScore", 0L);
        setLongField(term284828, term284828.getClass(), "totalBasicHighScore", 0L);
        setLongField(term284828, term284828.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term284828, term284828.getClass(), "totalExpertHighScore", 0L);
        setLongField(term284828, term284828.getClass(), "totalMasterHighScore", 0L);
        setLongField(term284828, term284828.getClass(), "totalUltimaHighScore", 0L);
        setField(term284828, term284828.getClass(), "eventWatchedDate", null);
        setIntField(term284828, term284828.getClass(), "friendCount", 0);
        setField(term284828, term284828.getClass(), "firstGameId", null);
        setField(term284828, term284828.getClass(), "firstRomVersion", null);
        setField(term284828, term284828.getClass(), "firstDataVersion", null);
        setField(term284828, term284828.getClass(), "firstPlayDate", null);
        setField(term284828, term284828.getClass(), "lastGameId", null);
        setField(term284828, term284828.getClass(), "lastRomVersion", null);
        setField(term284828, term284828.getClass(), "lastDataVersion", null);
        setField(term284828, term284828.getClass(), "lastLoginDate", null);
        setField(term284828, term284828.getClass(), "lastPlayDate", null);
        setIntField(term284828, term284828.getClass(), "lastPlaceId", 0);
        setField(term284828, term284828.getClass(), "lastPlaceName", null);
        setField(term284828, term284828.getClass(), "lastRegionId", null);
        setField(term284828, term284828.getClass(), "lastRegionName", null);
        setField(term284828, term284828.getClass(), "lastAllNetId", null);
        setField(term284828, term284828.getClass(), "lastClientId", null);
        setField(term284828, term284828.getClass(), "lastCountryCode", null);
        setField(term284828, term284828.getClass(), "userNameEx", null);
        setField(term284828, term284828.getClass(), "compatibleCmVersion", null);
        setIntField(term284828, term284828.getClass(), "medal", 0);
        setIntField(term284828, term284828.getClass(), "mapIconId", 0);
        setIntField(term284828, term284828.getClass(), "voiceId", 0);
        setIntField(term284828, term284828.getClass(), "avatarWear", 0);
        setIntField(term284828, term284828.getClass(), "avatarHead", 0);
        setIntField(term284828, term284828.getClass(), "avatarFace", 0);
        setIntField(term284828, term284828.getClass(), "avatarSkin", 0);
        setIntField(term284828, term284828.getClass(), "avatarItem", 0);
        setIntField(term284828, term284828.getClass(), "avatarFront", 0);
        setIntField(term284828, term284828.getClass(), "avatarBack", 0);
        setIntField(term284828, term284828.getClass(), "classEmblemBase", 0);
        setIntField(term284828, term284828.getClass(), "classEmblemMedal", 0);
        setIntField(term284828, term284828.getClass(), "stockedGridCount", 0);
        setIntField(term284828, term284828.getClass(), "exMapLoopCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattlePlayCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattleWinCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattleLoseCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term284828, term284828.getClass(), "charaIllustId", 0);
        setIntField(term284828, term284828.getClass(), "skillId", 0);
        setIntField(term284828, term284828.getClass(), "overPowerPoint", 0);
        setIntField(term284828, term284828.getClass(), "overPowerRate", 0);
        setIntField(term284828, term284828.getClass(), "overPowerLowerRank", 0);
        setIntField(term284828, term284828.getClass(), "avatarPoint", 0);
        setIntField(term284828, term284828.getClass(), "battleRankId", 0);
        setIntField(term284828, term284828.getClass(), "battleRankPoint", 0);
        setIntField(term284828, term284828.getClass(), "eliteRankPoint", 0);
        setIntField(term284828, term284828.getClass(), "netBattle1stCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattle2ndCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattle3rdCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattle4thCount", 0);
        setIntField(term284828, term284828.getClass(), "netBattleCorrection", 0);
        setIntField(term284828, term284828.getClass(), "netBattleErrCnt", 0);
        setIntField(term284828, term284828.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term284828, term284828.getClass(), "battleRewardStatus", 0);
        setIntField(term284828, term284828.getClass(), "battleRewardIndex", 0);
        setIntField(term284828, term284828.getClass(), "battleRewardCount", 0);
        setIntField(term284828, term284828.getClass(), "ext1", 0);
        setIntField(term284828, term284828.getClass(), "ext2", 0);
        setIntField(term284828, term284828.getClass(), "ext3", 0);
        setIntField(term284828, term284828.getClass(), "ext4", 0);
        setIntField(term284828, term284828.getClass(), "ext5", 0);
        setIntField(term284828, term284828.getClass(), "ext6", 0);
        setIntField(term284828, term284828.getClass(), "ext7", 0);
        setIntField(term284828, term284828.getClass(), "ext8", 0);
        setIntField(term284828, term284828.getClass(), "ext9", 0);
        setIntField(term284828, term284828.getClass(), "ext10", 0);
        setField(term284828, term284828.getClass(), "extStr1", null);
        setField(term284828, term284828.getClass(), "extStr2", null);
        setLongField(term284828, term284828.getClass(), "extLong1", 0L);
        setLongField(term284828, term284828.getClass(), "extLong2", 0L);
        setField(term284828, term284828.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term284828, term284828.getClass(), "isNetBattleHost", false);
        setIntField(term284828, term284828.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtLong2", argTypes, term284828, args);
    }

};


