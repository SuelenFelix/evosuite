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
import java.lang.Integer;

public class UserData_setLevel_1621568623310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219970;
     Object term4220047;

    public UserData_setLevel_1621568623310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219970 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4219970, term4219970.getClass(), "id", 0L);
        setField(term4219970, term4219970.getClass(), "card", null);
        setField(term4219970, term4219970.getClass(), "userName", null);
        setIntField(term4219970, term4219970.getClass(), "level", 0);
        setIntField(term4219970, term4219970.getClass(), "reincarnationNum", 0);
        setField(term4219970, term4219970.getClass(), "exp", null);
        setLongField(term4219970, term4219970.getClass(), "point", 0L);
        setLongField(term4219970, term4219970.getClass(), "totalPoint", 0L);
        setIntField(term4219970, term4219970.getClass(), "playCount", 0);
        setIntField(term4219970, term4219970.getClass(), "multiPlayCount", 0);
        setIntField(term4219970, term4219970.getClass(), "playerRating", 0);
        setIntField(term4219970, term4219970.getClass(), "highestRating", 0);
        setIntField(term4219970, term4219970.getClass(), "nameplateId", 0);
        setIntField(term4219970, term4219970.getClass(), "frameId", 0);
        setIntField(term4219970, term4219970.getClass(), "characterId", 0);
        setIntField(term4219970, term4219970.getClass(), "trophyId", 0);
        setIntField(term4219970, term4219970.getClass(), "playedTutorialBit", 0);
        setIntField(term4219970, term4219970.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4219970, term4219970.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4219970, term4219970.getClass(), "totalMapNum", 0);
        setLongField(term4219970, term4219970.getClass(), "totalHiScore", 0L);
        setLongField(term4219970, term4219970.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4219970, term4219970.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4219970, term4219970.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4219970, term4219970.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4219970, term4219970.getClass(), "totalUltimaHighScore", 0L);
        setField(term4219970, term4219970.getClass(), "eventWatchedDate", null);
        setIntField(term4219970, term4219970.getClass(), "friendCount", 0);
        setField(term4219970, term4219970.getClass(), "firstGameId", null);
        setField(term4219970, term4219970.getClass(), "firstRomVersion", null);
        setField(term4219970, term4219970.getClass(), "firstDataVersion", null);
        setField(term4219970, term4219970.getClass(), "firstPlayDate", null);
        setField(term4219970, term4219970.getClass(), "lastGameId", null);
        setField(term4219970, term4219970.getClass(), "lastRomVersion", null);
        setField(term4219970, term4219970.getClass(), "lastDataVersion", null);
        setField(term4219970, term4219970.getClass(), "lastLoginDate", null);
        setField(term4219970, term4219970.getClass(), "lastPlayDate", null);
        setIntField(term4219970, term4219970.getClass(), "lastPlaceId", 0);
        setField(term4219970, term4219970.getClass(), "lastPlaceName", null);
        setField(term4219970, term4219970.getClass(), "lastRegionId", null);
        setField(term4219970, term4219970.getClass(), "lastRegionName", null);
        setField(term4219970, term4219970.getClass(), "lastAllNetId", null);
        setField(term4219970, term4219970.getClass(), "lastClientId", null);
        setField(term4219970, term4219970.getClass(), "lastCountryCode", null);
        setField(term4219970, term4219970.getClass(), "userNameEx", null);
        setField(term4219970, term4219970.getClass(), "compatibleCmVersion", null);
        setIntField(term4219970, term4219970.getClass(), "medal", 0);
        setIntField(term4219970, term4219970.getClass(), "mapIconId", 0);
        setIntField(term4219970, term4219970.getClass(), "voiceId", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarWear", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarHead", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarFace", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarSkin", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarItem", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarFront", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarBack", 0);
        setIntField(term4219970, term4219970.getClass(), "classEmblemBase", 0);
        setIntField(term4219970, term4219970.getClass(), "classEmblemMedal", 0);
        setIntField(term4219970, term4219970.getClass(), "stockedGridCount", 0);
        setIntField(term4219970, term4219970.getClass(), "exMapLoopCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattlePlayCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattleWinCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattleLoseCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4219970, term4219970.getClass(), "charaIllustId", 0);
        setIntField(term4219970, term4219970.getClass(), "skillId", 0);
        setIntField(term4219970, term4219970.getClass(), "overPowerPoint", 0);
        setIntField(term4219970, term4219970.getClass(), "overPowerRate", 0);
        setIntField(term4219970, term4219970.getClass(), "overPowerLowerRank", 0);
        setIntField(term4219970, term4219970.getClass(), "avatarPoint", 0);
        setIntField(term4219970, term4219970.getClass(), "battleRankId", 0);
        setIntField(term4219970, term4219970.getClass(), "battleRankPoint", 0);
        setIntField(term4219970, term4219970.getClass(), "eliteRankPoint", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattle1stCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattle2ndCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattle3rdCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattle4thCount", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattleCorrection", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattleErrCnt", 0);
        setIntField(term4219970, term4219970.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4219970, term4219970.getClass(), "battleRewardStatus", 0);
        setIntField(term4219970, term4219970.getClass(), "battleRewardIndex", 0);
        setIntField(term4219970, term4219970.getClass(), "battleRewardCount", 0);
        setIntField(term4219970, term4219970.getClass(), "ext1", 0);
        setIntField(term4219970, term4219970.getClass(), "ext2", 0);
        setIntField(term4219970, term4219970.getClass(), "ext3", 0);
        setIntField(term4219970, term4219970.getClass(), "ext4", 0);
        setIntField(term4219970, term4219970.getClass(), "ext5", 0);
        setIntField(term4219970, term4219970.getClass(), "ext6", 0);
        setIntField(term4219970, term4219970.getClass(), "ext7", 0);
        setIntField(term4219970, term4219970.getClass(), "ext8", 0);
        setIntField(term4219970, term4219970.getClass(), "ext9", 0);
        setIntField(term4219970, term4219970.getClass(), "ext10", 0);
        setField(term4219970, term4219970.getClass(), "extStr1", null);
        setField(term4219970, term4219970.getClass(), "extStr2", null);
        setLongField(term4219970, term4219970.getClass(), "extLong1", 0L);
        setLongField(term4219970, term4219970.getClass(), "extLong2", 0L);
        setField(term4219970, term4219970.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4219970, term4219970.getClass(), "isNetBattleHost", false);
        setIntField(term4219970, term4219970.getClass(), "netBattleEndState", 0);
        term4220047 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4220047;
        callMethod(klass, "setLevel", argTypes, term4219970, args);
    }

};


